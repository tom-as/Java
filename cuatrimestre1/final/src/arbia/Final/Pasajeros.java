package arbia.Final;

import java.util.Scanner;

public class Pasajeros extends Tren{
	private String tipo_motor;
	
	public Pasajeros(int id, int cantidad_vagones, String tipo_motor) {
		super(id, cantidad_vagones);
		this.tipo_motor = tipo_motor;
	}
	
	public String getTipo_motor() {
		return tipo_motor;
	}



	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}



	public void mostrarDetalle() {
		Pantalla.vaciarLn();
		super.mostrarDetalle();
		System.out.println("Tipo de motor: " + this.tipo_motor);
		Pantalla.vaciarLn();
		
	}
	
	public static Pasajeros crearTrenPasajeros(Scanner sc) {
 
        Pantalla.imprimirMsj("Ingrese el ID del tren: ");
        int id = Pantalla.leerEntero(sc);
        sc.nextLine();

        Pantalla.imprimirMsj("Ingrese la cantidad de vagones: ");
        int cantidad_vagones = Pantalla.leerEntero(sc);
        sc.nextLine();

        String tipo_motor = leerMotor(sc);

        return new Pasajeros(id, cantidad_vagones, tipo_motor);

    }
	
	public static String leerMotor(Scanner sc) {
		String tipoMotor = "";
		while (true) {
			Pantalla.imprimirMsj("Ingrese el tipo de motor (electrico/gasolero): ");
			tipoMotor = Pantalla.leerString(sc);
			
			if (tipoMotor.equalsIgnoreCase("electrico") || tipoMotor.equalsIgnoreCase("gasolero") ) {
				break;
			}
			else {
				Pantalla.imprimirErr("El tipo ingresado no es correcto. Vuelva a intentarlo.");
			}
		}
		
		return tipoMotor;
	}
}
