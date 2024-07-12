package arbia.Final;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tren implements Comparable<Tren> {
	
	private int id;
	private int cantidad_vagones;
	
	public Tren(int id, int cantidad_vagones) {
		super();
		this.id = id;
		this.cantidad_vagones = cantidad_vagones;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCantidad_vagones() {
		return cantidad_vagones;
	}



	public void setCantidad_vagones(int cantidad_vagones) {
		this.cantidad_vagones = cantidad_vagones;
	}

	public void mostrarDetalle() {
		System.out.println("ID: " + this.id);
		System.out.println("Cantidad de vagones: " + this.cantidad_vagones);
		
	}

	public static Tren buscarTrenConMasVagones(ArrayList<Tren> trenes) {
		Tren trenEncontrado = null;
		
		Collections.sort(trenes);
		int ultimoIndice = trenes.size() - 1 ;
		trenEncontrado = trenes.get(ultimoIndice);
		
		return trenEncontrado;
	}
	
	public static Tren crearTren(Scanner sc) {
		Tren tren;
		String tipoTren = "";
        while(true) 
        {
        	Pantalla.imprimirMsj("¿El tren es de carga o de pasajeros? (carga/pasajeros): ");
        	tipoTren = sc.nextLine();
        	
        	if (tipoTren.equalsIgnoreCase("carga")) {
        		tren = Carga.crearTrenCarga(sc);
        		break;
        	} else if(tipoTren.equalsIgnoreCase("pasajeros")){
        		tren = Pasajeros.crearTrenPasajeros(sc);
        		break;
        	}
        	else {
        		Pantalla.imprimirErr("El tipo de tren debe ser carga o pasajeros. Intente nuevamente.");
        	}
        }
        
        return tren;
	}

	@Override
	public int compareTo(Tren o) {
		// TODO Auto-generated method stub
		if(this.getCantidad_vagones() > o.getCantidad_vagones()) return 1;
		if(this.getCantidad_vagones() < o.getCantidad_vagones()) return -1;
		else return 0;
	}
	
	
}
