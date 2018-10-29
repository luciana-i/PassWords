package Funcionalidades;

import java.util.List;

import dominio.Aplicaciones;
import dominio.Usuario;

public class FuncionesMenu {
	private static FuncionesMenu funcMenu;

	public void nuevoUsuario(int dni, String nombre,Usuario usr, List <Aplicaciones> lista) {
	usr.setDni(dni);
	usr.setNombre(nombre);
	usr.setListaAplicaciones(lista);
	System.out.println("Se agrego el usuario nuevo");
	}
	
	public void AgregarApp(String nombreApp, String nombreUsr, String pass, Usuario usr) {
		Aplicaciones app = new Aplicaciones (nombreApp, nombreUsr, pass);
		System.out.println("Se agrego la nueva aplicacion");
		usr.getListaAplicaciones().add(app);
	}
	
	public String buscarPassword (String nombreApp, Usuario usr) {
		for(Aplicaciones item : usr.getListaAplicaciones()) {
			if (item.getNombreApplicacion().toLowerCase().equals(nombreApp.toLowerCase())) {
				return item.getPassword();
			}
		}		
		System.out.println("no hay app con ese nombre");
		return "Error";
		}
		
	
	public void buscarDatosApp (String nombreApp,Usuario usr) {
		boolean flag = false;
		for (Aplicaciones item : usr.getListaAplicaciones()){
			if (item.getNombreApplicacion().toLowerCase().equals(nombreApp.toLowerCase())) {
				System.out.println("El nombre de la aplicacion es: " + item.getNombreApplicacion());
				System.out.println("El nombre del usuario de la aplicacion es: " + item.getNombreUsuario());
				System.out.println("La contraseña es: " + item.getPassword());
				flag = true;
			}
		}
		if (flag){
			System.out.println("Se encontro app");
		}else
			System.out.println("No se encontro app");
	}
	public static FuncionesMenu getFuncmenu() {
		if (funcMenu == null ){
			funcMenu = new FuncionesMenu();
		}
		return funcMenu;
	}
}
