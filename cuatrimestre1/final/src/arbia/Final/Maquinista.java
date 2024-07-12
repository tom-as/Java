package arbia.Final;

import java.util.Scanner;

public class Maquinista extends Empleado {
	private int nro_licencia;
	private int nro_viajes_realizados;
	private int categoria;
	
	public Maquinista(String nombre, String apellido, int dni, int nro_licencia, int nro_viajes_realizados,
			int categoria) {
		super(nombre, apellido, dni);
		this.nro_licencia = nro_licencia;
		this.nro_viajes_realizados = nro_viajes_realizados;
		this.categoria = categoria;
	}
	
	
	public int getNro_licencia() {
		return nro_licencia;
	}


	public void setNro_licencia(int nro_licencia) {
		this.nro_licencia = nro_licencia;
	}


	public int getNro_viajes_realizados() {
		return nro_viajes_realizados;
	}


	public void setNro_viajes_realizados(int nro_viajes_realizados) {
		this.nro_viajes_realizados = nro_viajes_realizados;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public void mostrarDetalle() {
		Pantalla.vaciarLn();
		System.out.println("Maquinista:");
		super.mostrarDetalle();
		System.out.println("Nro licencia: " + this.nro_licencia);
		System.out.println("Viajes realizados: " + this.nro_viajes_realizados);
		System.out.println("Categoría: " + this.categoria);
		Pantalla.vaciarLn();
	}
	
	public static Maquinista crearMaquinista(Scanner sc) {
		
		Pantalla.imprimirMsj("--------------- CARGA DE MAQUINISTA --------------------");
		Pantalla.imprimirMsj("Ingrese el nombre: ");
        String nombre = Pantalla.leerString(sc);

        Pantalla.imprimirMsj("Ingrese el apellido: ");
        String apellido = Pantalla.leerString(sc);

        Pantalla.imprimirMsj("Ingrese el DNI: ");
        int dni = Pantalla.leerEntero(sc);
        sc.nextLine();

        Pantalla.imprimirMsj("Ingrese el número de licencia: ");
        int nro_licencia = Pantalla.leerEntero(sc);
        sc.nextLine();

        Pantalla.imprimirMsj("Ingrese el número de viajes realizados: ");
        int nro_viajes_realizados = Pantalla.leerEntero(sc);
        sc.nextLine();

        Pantalla.imprimirMsj("Ingrese la categoría: ");
        int categoria = Pantalla.leerEntero(sc);


        return new Maquinista(nombre, apellido, dni, nro_licencia, nro_viajes_realizados, categoria);
	}
	
    public static int leerCategoria(Scanner sc) {
        int input = -1;

        while (true) {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input > 0) {
                    break; 
                } else {
                    Pantalla.imprimirErr("El valor ingresado no es mayor a 0. Intente de nuevo.");
                }
            } else {
            	Pantalla.imprimirErr("El valor ingresado no es válido. Intente de nuevo.");
                sc.next();
            }
        }

        return input;
    }
}

