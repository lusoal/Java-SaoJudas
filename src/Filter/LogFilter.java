package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Negocio.Usuario;

@WebFilter("/*")
public class LogFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		//Atributo logado e o objeto usuario encapsulado
		Usuario usuario = (Usuario)session.getAttribute("logado");
		
		//Mostra o que o usuario esta executando e o que ele chamou
		if(usuario == null){
			System.out.println("Nenhuma requisicao");
		} else {
			System.out.println(usuario.getUsuario()+ " -> " + req.getParameter("command"));
		}
		
		//Verificar o motivo de haver dois IFS
		chain.doFilter(request, response);
		
		//After Doing the Filter
		if(usuario == null){
			System.out.println("Nenhuma requisicao");
		} else {
			System.out.println(req.getParameter("command")+" -> " + usuario.getUsuario());
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
