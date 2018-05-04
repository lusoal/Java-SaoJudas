package Command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Negocio.Usuario;
import Service.UsuarioService;

public class RealizarLogin implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario(username, password);
		UsuarioService service = new UsuarioService();
		
		boolean validar = service.validarLogin(usuario);
		System.out.println(validar);
		if(validar) {
			HttpSession session = request.getSession();
			session.setAttribute("logado", usuario);
			System.out.println("Logou: "+usuario);
			response.sendRedirect("cadastrar_pais.jsp");
		}else {
			System.out.println("Nao Logou" + usuario);
		}
		
	}

}
