package Command;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Negocio.Usuario;
import Service.UsuarioService;
import Utils.CryptoAES;

public class CriarUsuario implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String pUser = request.getParameter("usuario");
		String pSenha = request.getParameter("senha");
		
		//transformando senha do usuario em bytes
		Usuario usuario = new Usuario(pUser, pSenha.getBytes("ISO-8859-1"));
		UsuarioService service = new UsuarioService();
		String path = request.getContextPath();
		System.out.println(path);
		try {
			System.out.println("Entrei na classe command");
			service.criarUsuario(usuario);
			response.sendRedirect("index.jsp");
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
