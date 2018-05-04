package Service;
import Negocio.Usuario;
import DAO.UsuarioDao;

public class UsuarioService {
	UsuarioDao dao;
	
	public UsuarioService() {
		dao = new UsuarioDao();
	}
	
	public boolean validarLogin(Usuario usuario) {
		return dao.validarLogin(usuario);
	}
	
}
