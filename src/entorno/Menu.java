package entorno;
import Funcionalidades.*;
import java.util.List;
import java.util.Scanner;

import dominio.*;


public class Menu {
	public Menu () {
		
	}
	Scanner reader = new Scanner(System.in);
	
	public Integer menuOpciones () throws TeclaNoEsperadaExcepcion {
		boolean bandera = true;
		while (bandera) {
			this.vistaMenu();
			try{
				Integer opcion=reader.nextInt();
				this.vistaMenu();
				if (opcion <6 && opcion >0) {
					bandera=false;
					return opcion;
					}
				}catch (Exception e){
					reader.reset();
					throw new TeclaNoEsperadaExcepcion();
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
				FuncionesMenu.getFuncmenu().nuevoUsuario(dni, nombre, usr, lista);	
				break;
			case 2:
				System.out.println("Ingrese nombre nueva aplicacion");
				String app= reader.next();
				System.out.println("Ingrese usuario app");
				String usrApp= reader.next();
				System.out.println("Ingrese password app");
				String passApp= reader.next();
				FuncionesMenu.getFuncmenu().AgregarApp(app, usrApp, passApp, usr);
				break;
			case 3:
				System.out.println("Ingrese nombre aplicacion");
				String applicacion= reader.next();
				System.out.println("Su password es: "+ FuncionesMenu.getFuncmenu().buscarPassword(applicacion, usr));
				break;
			case 4:
				System.out.println("Ingrese nombre aplicacion");
				String aplicacion= reader.next();
				FuncionesMenu.getFuncmenu().buscarDatosApp(aplicacion,usr);
				break;
			case 5:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Datos ingresados incorrectos");
				break;
		}
	}
}
