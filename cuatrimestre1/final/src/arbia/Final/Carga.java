package arbia.Final;

import java.util.Scanner;

public class Carga extends Tren{
	private String tipo_carga;
		
	public Carga(int id, int cantidad_vagones, String tipo_carga) {
		super(id, cantidad_vagones);
		this.tipo_carga = tipo_carga;
	}
	
	public String getTipo_carga() {
		return tipo_carga;
	}



	public void setTipo_carga(String tipo_carga) {
		this.tipo_carga = tipo_carga;
	}



	public void mostrarDetalle() {
		Pantalla.vaciarLn();
		super.mostrarDetalle();
		System.out.println("Tipo de carga: " + this.tipo_carga);	
		Pantalla.vaciarLn();
	}
	
	public static Carga crearTrenCarga(Scanner sc) {
 
        Pantalla.imprimirMsj("Ingrese el ID del tren: ");
        int id = Pantalla.leerEntero(sc);
        sc.nextLine();

        Pantalla.imprimirMsj("Ingrese la cantidad de vagones: ");
        int cantidad_vagones = Pantalla.leerEntero(sc);
        sc.nextLine();

        String tipo_carga = leerCarga(sc);

        return new Carga(id, cantidad_vagones, tipo_carga);

    }
	
	public static String leerCarga(Scanner sc) {
		String tipoCarga;
		while (true) {
			Pantalla.imprimirMsj("Ingrese el tipo de carga (liviana/pesada): ");
			tipoCarga = Pantalla.leerString(sc);
			
			if (tipoCarga.equalsIgnoreCase("liviana") || tipoCarga.equalsIgnoreCase("pesada") ) {
				break;
			}
			else {
				Pantalla.imprimirErr("El tipo ingresado no es correcto. Vuelva a intentarlo.");
			}
		}
		
		return tipoCarga;
	}
}
