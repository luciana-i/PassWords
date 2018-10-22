package dominio;

import java.util.List;

public class Usuario {
	private String nombre;
	private int dni;
	private List <Aplicaciones> listaAplicaciones;
	
	public Usuario (String prmNombre, int prmDni, List <Aplicaciones> lista) {
		this.nombre=prmNombre;
		this.dni=prmDni;
		listaAplicaciones=lista;
	}
	public Usuario () {
		
	}
	
	
	public List<Aplicaciones> getListaAplicaciones() {
		return listaAplicaciones;
	}
	public void setListaAplicaciones(List<Aplicaciones> listaAplicaciones) {
		this.listaAplicaciones = listaAplicaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
}
