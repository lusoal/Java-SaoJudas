package Filter;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import Utils.EscreverArquivo;

import Negocio.Usuario;

@WebFilter("/*")
public class LogFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		EscreverArquivo escrever = new EscreverArquivo();
		
		//Abrir o arquivo de log
		
		Calendar calendar = Calendar.getInstance();
		Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		//Atributo logado e o objeto usuario encapsulado
		Usuario usuario = (Usuario)session.getAttribute("logado");
		
		//Mostra o que o usuario esta executando e o que ele chamou
		if(usuario == null){
			
			escrever.abrir("pais_log.txt");
			escrever.escrever(""+currentTimestamp+" nenhuma requisicao");
			escrever.fechar();
		} else {
			escrever.abrir("pais_log.txt");
			escrever.escrever(""+currentTimestamp+" "+usuario.getUsuario()+ " -> " + req.getParameter("command"));
			escrever.fechar();
		}
		
		//Verificar o motivo de haver dois IFS
		chain.doFilter(request, response);
		
		//After Doing the Filter
		if(usuario == null){
			escrever.abrir("pais_log.txt");
			escrever.escrever(""+currentTimestamp+" nenhuma requisicao");
			escrever.fechar();
		} else {
			escrever.abrir("pais_log.txt");
			escrever.escrever(""+currentTimestamp+" "+req.getParameter("command")+" -> " + usuario.getUsuario());
			escrever.fechar();
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
