package arbia.Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		Maquinista maquinista1 = new Maquinista("Jorge", "Perez", 3945655, 2544, 2, 1);
		Maquinista maquinista2 = new Maquinista("Tomas", "Gosci", 44694200, 1098, 5, 2);
		Maquinista maquinista3 = new Maquinista("Ariel", "Sujarchuk", 25336347, 0366, 10, 3);
		
		Guarda guarda1 = new Guarda("Santino", "Rodriguez", 1336974, 3);
		Guarda guarda2 = new Guarda("Ruben", "Gonzalez", 11200974, 6);
		Guarda guarda3 = new Guarda("Uriel", "Negus", 6999774, 1);
		
		empleados.add(maquinista1); 
		empleados.add(maquinista2); 
		empleados.add(maquinista3);
		empleados.add(guarda1);
		empleados.add(guarda2);
		empleados.add(guarda3);
		
		ArrayList<Tren> trenes = new ArrayList<>();
		
		Carga carga1 = new Carga(556, 12, "Pesada");
		Carga carga2 = new Carga(211, 23, "Liviana");
		Carga carga3 = new Carga(420, 18, "Liviana");
		Carga carga4 = new Carga(991, 6, "Pesada");
		
		Pasajeros pasajeros1 = new Pasajeros(443, 6, "Gasolero");
		Pasajeros pasajeros2 = new Pasajeros(201, 4, "Electrico");
		Pasajeros pasajeros3 = new Pasajeros(444, 7, "Gasolero");
		
		trenes.add(carga1);
		trenes.add(carga2);
		trenes.add(carga3);
		trenes.add(carga4);
		trenes.add(pasajeros1);
		trenes.add(pasajeros2);
		trenes.add(pasajeros3);
		
		Viaje viaje1 = new Viaje(1394, maquinista1, guarda1, pasajeros1, "29/04/2024", "13:35", "Tigre", "Retiro");
		Viaje viaje2 = new Viaje(2221, maquinista2, guarda2, carga1, "06/06/2024", "15:25", "Pilar", "Nuñez");
		Viaje viaje3 = new Viaje(3350, maquinista2, guarda3, carga2, "09/07/2024", "07:05", "Escobar", "Nuñez");
		
		ArrayList<Viaje> viajes = new ArrayList<>();
		viajes.add(viaje1);
		viajes.add(viaje2);
		viajes.add(viaje3);
		
	    Scanner sc = new Scanner(System.in);
		manejarSeleccion(empleados, trenes, viajes, sc);
		
		sc.close();
	}

	public static void manejarSeleccion(ArrayList<Empleado> empleados, ArrayList<Tren> trenes, ArrayList<Viaje> viajes, Scanner sc) {

	    boolean continuar = true;

	    while (continuar) {
	        Pantalla.mostrarMenu();
	        System.out.println("Ingrese una opción: ");
	        
	        if (sc.hasNextInt()) {
	        	
	            int opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	                case 1:
	                    seleccionEmpleadoPorDNI(sc, empleados);
	                    break;
	                case 2:
	                    seleccionTrenConMasVagones(trenes);
	                    break;
	                case 3:
	                    seleccionViajesPorDestino(sc, viajes);
	                    break;
	                case 4:
	                    seleccionViajesPorDNIEmpleado(sc, viajes);
	                    break;
	                case 5:
	                    seleccionViajesDeTrenesDeCarga(viajes);
	                    break;
	                case 6:
	                    Viaje.crearViaje(sc, empleados, trenes, viajes);
	                    break;
	                case 7:
	                    continuar = false;
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente de nuevo.");
	            }
	        } else {
	            System.out.println("Entrada no válida. Ingrese un número.");
	            sc.nextLine();
	        }
	    }
	}

	public static void seleccionEmpleadoPorDNI(Scanner sc, ArrayList<Empleado> empleados) {
		
		Pantalla.imprimirMsj("Ingrese el DNI que desea buscar: ");
		int dniEmpleado = Pantalla.leerEntero(sc);
		
		Empleado empleadoEncontrado = Empleado.buscarPorDNI(empleados, dniEmpleado);
		if(empleadoEncontrado == null) {
			Pantalla.imprimirErr("No se encontró un empleado con ese DNI. Intente nuevamente.");
		}
		else {
			empleadoEncontrado.mostrarDetalle();					
		}
		
	}
	
	public static void seleccionTrenConMasVagones(ArrayList<Tren> trenes) {

		Tren trenMasVagones = Tren.buscarTrenConMasVagones(trenes);
		Pantalla.imprimirMsj("Buscando tren con más vagones...");
		trenMasVagones.mostrarDetalle();
		
	}
	
	public static void seleccionViajesPorDestino(Scanner sc, ArrayList<Viaje> viajes) {
		Pantalla.imprimirMsj("Ingrese el destino de viajes que desea buscar: ");
		String destino = Pantalla.leerString(sc);
		
		ArrayList<Viaje> viajesEncontrados = null;
		viajesEncontrados = Viaje.buscarViajesPorDestino(viajes, destino);
		
		if(viajesEncontrados == null) { 
			Pantalla.imprimirErr("No se encontraron viajes para el destino especificado." ); 
		}
		else {
			for(Viaje viaje: viajesEncontrados) {
				viaje.mostrarDetalle();
			}
		}
	}
	
	public static void seleccionViajesPorDNIEmpleado(Scanner sc, ArrayList<Viaje> viajes) {
		Pantalla.imprimirMsj("Ingrese el DNI del empleado al que quiere buscarle los viajes: ");
		int dniEmpleado = Pantalla.leerEntero(sc);
		
		ArrayList<Viaje> viajesEncontrados = null;
		viajesEncontrados = Viaje.buscarViajesPorDNIEmpleado(viajes, dniEmpleado);
		
		if(viajesEncontrados == null) { 
			Pantalla.imprimirErr("No se encontraron viajes para el DNI especificado." ); 
		}
		else {
			
			for(Viaje viaje: viajesEncontrados) {
				viaje.mostrarDetalle();
			}
		}
	}
	
	public static void seleccionViajesDeTrenesDeCarga(ArrayList<Viaje> viajes) {
		
		ArrayList<Viaje> viajesEncontrados = null;
		viajesEncontrados = Viaje.buscarViajesPorTipoTren(viajes, "Carga");
		
		if(viajesEncontrados == null) { 
			Pantalla.imprimirErr("No se encontraron viajes de trenes de carga." ); 
		}
		else {
			System.out.println("VIAJES ENCONTRADOS PARA TRENES DE CARGA: ");
			for(Viaje viaje: viajesEncontrados) {
				viaje.mostrarDetalle();
			}
		}
	
	}
	
}
