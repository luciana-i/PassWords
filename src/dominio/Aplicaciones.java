package dominio;

public class Aplicaciones {
	private String nombreApplicacion;
	private String nombreUsuario;
	private String password;
	
	public Aplicaciones (String prmNombreApp, String prmNombreUsr, String prmPass) {
		this.nombreApplicacion=prmNombreApp;
		this.nombreUsuario=prmNombreUsr;
		this.password=prmPass;
	}
	
		
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombreApplicacion() {
		return nombreApplicacion;
	}
	public void setNombreApplicacion(String nombreApplicacion) {
		this.nombreApplicacion = nombreApplicacion;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
}
