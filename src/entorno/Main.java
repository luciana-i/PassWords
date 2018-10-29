package entorno;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dominio.*;

public class Main {

	
	public void manejoPrograma(boolean isAlive, Menu menu, Integer opcion, Usuario usr, List<Aplicaciones> lista, Reader reader){
		
		
	}
	public static void main(String[] args) {
	//	List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		List<Aplicaciones> listaAplicaciones = new ArrayList <Aplicaciones> ();
		Menu menu = new Menu();
		Usuario usr = new Usuario();
		Integer opcion;
		boolean isAlive= true;
		Scanner reader = new Scanner(System.in);
		
		/// HARCODEADO
		Aplicaciones app = new Aplicaciones("spotify", "Lu", "123");
		listaAplicaciones.add(app);
		Usuario usr2 = new Usuario("Luciana", 123, listaAplicaciones);
		// HARCODEADO
		
		do {
			
			try{
				opcion = menu.menuOpciones();
				menu.mapeoOpciones(opcion, usr2, listaAplicaciones);
				if (opcion == 5){
					System.exit(0);
					reader.close();
				}
				System.out.println("¿Desea continuar? Y/N");
				String option=reader.next();
				if (option.toLowerCase()== "y") {
					isAlive=true;
					System.out.println("Continuar");
				}else {
					isAlive=false;
				System.out.println("Adios");
				reader.close();
				}
				
			}catch (TeclaNoEsperadaExcepcion e){
				System.out.println(e.mensajeInt);
				reader.reset();
			}
			
			
		}while (isAlive);		
		
	}
	
	
}
