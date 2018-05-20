package Negocio;

public class Usuario {
	private String usuario;
	private byte[] senha;
	
	
	public Usuario(String usuario,byte[] senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public byte[] getSenha() {
		return senha;
	}
	public void setSenha(byte[] senha) {
		this.senha = senha;
	}
	
	
}
