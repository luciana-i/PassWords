package entorno;
import java.util.List;
import java.util.Scanner;

import dominio.*;


public class Menu {
	public Menu () {
		
	}
	Scanner reader = new Scanner(System.in);
	
	public int menuOpciones () {
		boolean bandera = true;
		while (bandera) {
			this.vistaMenu();
			int opcion=reader.nextInt();
			if (opcion <5 && opcion >0) {
				bandera=false;
				return opcion;
			}
		}
		return -1;
	}
	
	public void vistaMenu() {
		System.out.println("Bienvenido al sistema de contraseñas, indique la opcion correcta\n");
		System.out.println("Ingresar nuevo usuario opcion 1");
		System.out.println("Ingresar nueva aplicacion opcion 2");
		System.out.println("Buscar Password opcion 3");
		System.out.println("Buscar Datos aplicacion opcion 4");
		System.out.println("Finalizar opcion 5");
	}
	
	public void mapeoOpciones(int opcion,Usuario usr, List <Aplicaciones> lista) {
		switch (opcion) {
			case 1:
				System.out.println("Ingrese nombre nuevo usuario");
				String nombre =reader.next();
				System.out.println("Ingrese dni");
				int dni= reader.nextInt();
				this.nuevoUsuario(dni, nombre, usr, lista);	
				break;
			case 2:
				System.out.println("Ingrese nombre nueva aplicacion");
				String app= reader.next();
				System.out.println("Ingrese usuario app");
				String usrApp= reader.next();
				System.out.println("Ingrese password app");
				String passApp= reader.next();
				this.AgregarApp(app, usrApp, passApp, usr);
				break;
			case 3:
				System.out.println("Ingrese nombre aplicacion");
				String applicacion= reader.next();
				String pass;
				pass = this.buscarPassword(applicacion, usr);
				break;
			case 4:
				System.out.println("Ingrese nombre aplicacion");
				String aplicacion= reader.next();
				this.buscarDatosApp(aplicacion,usr);
				break;
			case 5:
				break;
			default:
				System.out.println("Datos ingresados incorrectos");
				break;
		}
	}
	
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
			if (item.getNombreApplicacion().toLowerCase()== nombreApp.toLowerCase()) {
				System.out.println("La contraseña es: " +item.getPassword());
				return item.getPassword();
			}
		}
		for(Aplicaciones item : usr.getListaAplicaciones()) {
				System.out.println("La contraseña es: " +item.getPassword()+ "usuario es: " + item.getNombreApplicacion() + "usuario es: " + item.getNombreUsuario());
			}///no agarra el get NombreAplicacion La contraseña es: 123usuario es: Lusuario es: Lu
		System.out.println("no hay app con ese nombre");
		return "Error";
		}
		
	
	public void buscarDatosApp (String nombreApp,Usuario usr) {
		for (Aplicaciones item : usr.getListaAplicaciones()){
			if (item.getNombreApplicacion().toLowerCase()== nombreApp.toLowerCase()) {
				System.out.println("El nombre de la aplicacion es: " + item.getNombreApplicacion());
				System.out.println("El nombre del usuario de la aplicacion es: " + item.getNombreUsuario());
				System.out.println("La contraseña es: " + item.getPassword());
			}
		}
	}
	
	
	

}
