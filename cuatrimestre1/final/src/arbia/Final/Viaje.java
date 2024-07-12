package arbia.Final;
import java.util.ArrayList;
import java.util.Scanner;

public class Viaje {

	private int codigo;
	private Maquinista maquinista;
	private Guarda guarda;
	private Tren tren;
	private String fecha;
	private String hora_salida;
	private String estacion_salida;
	private String estacion_destino;
	private int nro_paradas;
	
	
	
	public Viaje(int codigo, Maquinista maquinista, Guarda guarda, Tren tren, String fecha, String hora_salida,
			String estacion_salida, String estacion_destino) {
		super();
		this.codigo = codigo;
		this.maquinista = maquinista;
		this.guarda = guarda;
		this.tren = tren;
		this.fecha = fecha;
		this.hora_salida = hora_salida;
		this.estacion_salida = estacion_salida;
		this.estacion_destino = estacion_destino;
		this.nro_paradas = calcularParadas();
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public Maquinista getMaquinista() {
		return maquinista;
	}



	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}



	public Guarda getGuarda() {
		return guarda;
	}



	public void setGuarda(Guarda guarda) {
		this.guarda = guarda;
	}



	public Tren getTren() {
		return tren;
	}



	public void setTren(Tren tren) {
		this.tren = tren;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getHora_salida() {
		return hora_salida;
	}



	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}



	public String getEstacion_salida() {
		return estacion_salida;
	}



	public void setEstacion_salida(String estacion_salida) {
		this.estacion_salida = estacion_salida;
	}



	public String getEstacion_destino() {
		return estacion_destino;
	}



	public void setEstacion_destino(String estacion_destino) {
		this.estacion_destino = estacion_destino;
	}



	public int getNro_paradas() {
		return nro_paradas;
	}



	public void setNro_paradas(int nro_paradas) {
		this.nro_paradas = nro_paradas;
	}

	public int calcularParadas() {
		String tipoDeTren = this.getTren().getClass().getSimpleName();
		if (tipoDeTren.equalsIgnoreCase("Carga")) return 2;
		else return 5;
	}

	public void mostrarDetalle() {
		Pantalla.vaciarLn();
		Pantalla.imprimirMsj("--------------- INICIO DE VIAJE --------------------");
		System.out.println("Detalle del Viaje:");
	    System.out.println("Código: " + codigo);
	    System.out.println("Fecha: " + fecha);
	    System.out.println("Hora de Salida: " + hora_salida);
	    System.out.println("Estación de Salida: " + estacion_salida);
	    System.out.println("Estación de Destino: " + estacion_destino);
	    System.out.println("Número de Paradas: " + nro_paradas);
	    System.out.println("-----------------------");
	    maquinista.mostrarDetalle();
	    System.out.println("-----------------------");
	    guarda.mostrarDetalle();
	    System.out.println("-----------------------");
	    tren.mostrarDetalle();
	    Pantalla.vaciarLn();
	    Pantalla.imprimirMsj("----------------- FIN DE VIAJE --------------------");
	}
	
	public static ArrayList<Viaje> buscarViajesPorDestino(ArrayList<Viaje> viajes, String destino ) {
		ArrayList<Viaje> viajesEncontrados = new ArrayList<>();
		for (Viaje viaje : viajes) {
            if (viaje.estacion_destino.equalsIgnoreCase(destino)) {
                viajesEncontrados.add(viaje);
            }
        }
		if (viajesEncontrados.isEmpty()) {
            System.out.println("No se encontraron viajes al destino: " + destino);
            }
		
		return viajesEncontrados;
	}
	
	public static ArrayList<Viaje> buscarViajesPorDNIEmpleado(ArrayList<Viaje> viajes, int dni) {
		ArrayList<Viaje> viajesEncontrados = new ArrayList<>();
		for (Viaje viaje : viajes) {
            if (viaje.maquinista.getDni() == dni) {
                viajesEncontrados.add(viaje);
            }
        }
		if (viajesEncontrados.isEmpty()) {
            System.out.println("No se encontraron viajes para el trabajador con DNI:  " + dni);
            }
		
		return viajesEncontrados;
	}
	
	public static ArrayList<Viaje> buscarViajesPorTipoTren(ArrayList<Viaje> viajes, String tipo ) {
		ArrayList<Viaje> viajesEncontrados = new ArrayList<>();
		for (Viaje viaje : viajes) {
			String nombreTipoTren = viaje.tren.getClass().getSimpleName();
            if (nombreTipoTren.equalsIgnoreCase(tipo)) {
                viajesEncontrados.add(viaje);
            }
        }
		if (viajesEncontrados.isEmpty()) {
            System.out.println("No se encontraron viajes para trenes de tipo: " + tipo);
            }
		
		return viajesEncontrados;
	}
	
    public static void crearViaje(Scanner sc, ArrayList<Empleado> empleados, ArrayList<Tren> trenes, ArrayList<Viaje> viajes) {
        Pantalla.imprimirMsj("Ingrese el código del viaje: ");
        int codigo = Pantalla.leerEntero(sc);;
        sc.nextLine();
        
        Maquinista maquinista = Maquinista.crearMaquinista(sc);
        sc.nextLine();
        Guarda guarda = Guarda.crearGuarda(sc);
        
        empleados.add(guarda);
        empleados.add(maquinista);

        Tren tren = Tren.crearTren(sc);
        trenes.add(tren);

        Pantalla.imprimirMsj("Ingrese la fecha del viaje (formato DD/MM/AAAA): ");
        String fecha = sc.nextLine();

        Pantalla.imprimirMsj("Ingrese la hora de salida (formato HH:MM): ");
        String hora_salida = sc.nextLine();

        Pantalla.imprimirMsj("Ingrese la estación de salida: ");
        String estacion_salida = sc.nextLine();

        Pantalla.imprimirMsj("Ingrese la estación de destino: ");
        String estacion_destino = sc.nextLine();
        
        Viaje nuevoViaje = new Viaje(codigo, maquinista, guarda, tren, fecha, hora_salida, estacion_salida, estacion_destino);
        
        viajes.add(nuevoViaje);

    }
	

}
