package arbia.Final;
import java.util.Scanner;

public class Pantalla {
	
	public static int leerEntero(Scanner sc) {

	    while (!sc.hasNextInt()) {
	        imprimirErr("El valor ingresado no es válido. Intente de nuevo: ");
	        sc.nextLine();
	    }

	    int input = sc.nextInt();

	    return input;
	}

	
	public static String leerString(Scanner sc){
		String input = sc.nextLine();	
		
		if (input == null ) {
			imprimirErr("El valor ingresado tiene que ser un string.");
			leerString(sc);
		}
		
		return input;
	}
	
	public static void imprimirMsj(String msj) {
		System.out.println(msj);
	}
	
	public static void imprimirErr(String msj) {
		System.out.println("*** ERROR:  "+ msj);
	}
	
	public static void vaciarLn() {
		imprimirMsj("");
	}
	public static void mostrarMenu() {
		vaciarLn();
		imprimirMsj(" Seleccione una opción ");
		imprimirMsj("1- Buscar empleado por DNI.");
		imprimirMsj("2- Buscar tren con más vagones.");
		imprimirMsj("3- Buscar viajes por destino.");
		imprimirMsj("4- Buscar viajes por DNI de Empleado (Maquinista o Guarda).");
		imprimirMsj("5- Buscar viajes de los trenes de carga.");
		imprimirMsj("6- Cargar nuevo viaje.");
		imprimirMsj("7- Salir.");
		vaciarLn();
    }
	

	
}
