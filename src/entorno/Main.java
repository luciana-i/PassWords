package entorno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dominio.*;

public class Main {

	public static void main(String[] args) {
	//	List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		List<Aplicaciones> listaAplicaciones = new ArrayList <Aplicaciones> ();
		Menu menu = new Menu();
		Usuario usr = new Usuario();
		int opcion;
		boolean isAlive= true;
		Scanner reader = new Scanner(System.in);
		
		//despues se hara una lista de esto
		/*			
		Usuario usr = new Usuario();
			
		usr.listaAplicaciones = new ArrayList <Aplicaciones>();
		usr.setDni(33333);
		usr.setNombre("Admin");
		
		menu.AgregarApp("spotify", "luciana", "333", usr.listaAplicaciones);
		
		for(Aplicaciones item : usr.listaAplicaciones) {
			System.out.println("El nombre de la app es: "+ item.getNombreApplicacion()+"\nEl nombre del usuario es: " + item.getNombreUsuario() + "\nLa pass es: " +item.getPassword());
		}
		*/
		do {
			opcion = menu.menuOpciones();	
			menu.mapeoOpciones(opcion, usr, listaAplicaciones);
			System.out.println("¿Desea continuar? Y/N");
			String option=reader.next();
			if (option.toLowerCase()!= "y") {
				isAlive=true;
				System.out.println("Termino");
			}else {
				isAlive=false;
			System.out.println("Continuar");
			}
		}while (isAlive);		
		
	}
	
}
