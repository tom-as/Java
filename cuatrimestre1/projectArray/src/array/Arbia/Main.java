package array.Arbia;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] persona = new String[5];
		persona = cargarDatos(persona);		
		mostrarDatos(persona);	
		
	}
	
	public static String[] cargarDatos(String[] persona) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		persona[0] = sc.nextLine();
		
		System.out.println("Ingrese su apellido");
		persona[1] = sc.nextLine();
		
		System.out.println("Ingrese su DNI");
		persona[2] = sc.nextLine();
		
		persona[3] = persona[0].charAt(0) + "" + persona[1].charAt(0);
		
		persona[4] = persona[1].length() + "";
		
		return persona;
		
	}
	
	public static void mostrarDatos(String[] persona) {
		System.out.println("Nombre: " + persona[0]);
		System.out.println("Apellido: " + persona[1]);
		System.out.println("DNI: " + persona[2]);
		System.out.println("Iniciales nombre y apellido: " + persona[3]);
		System.out.println("Longitud de apellido: " + persona[4]);
	}

}
