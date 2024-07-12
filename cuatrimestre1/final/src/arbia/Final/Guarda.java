package arbia.Final;

import java.util.Scanner;

public class Guarda extends Empleado{
	
	private int anos_experiencia;
	private String turno;
	
	public Guarda(String nombre, String apellido, int dni, int anos_experiencia) {
		super(nombre, apellido, dni);
		this.anos_experiencia = anos_experiencia;
		this.turno = calcularTurno();
	}
	
	public int getAnos_experiencia() {
		return anos_experiencia;
	}



	public void setAnos_experiencia(int anos_experiencia) {
		this.anos_experiencia = anos_experiencia;
	}



	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String calcularTurno() {
		int anos = this.anos_experiencia;
		if (anos >= 10) return "Noche";
		else return "Dia";
	}


	public void mostrarDetalle() {
		Pantalla.vaciarLn();
		System.out.println("Guarda:");
		super.mostrarDetalle();
		System.out.println("Años de experiencia: " + this.anos_experiencia);
		System.out.println("Turno: " + this.turno);
		Pantalla.vaciarLn();
	}
	
	public static Guarda crearGuarda(Scanner sc) {

        Pantalla.imprimirMsj("--------------- CARGA DE GUARDA --------------------");
        Pantalla.imprimirMsj("Ingrese el nombre: ");
        String nombre = Pantalla.leerString(sc);

        Pantalla.imprimirMsj("Ingrese el apellido: ");
        String apellido = Pantalla.leerString(sc);

        Pantalla.imprimirMsj("Ingrese el DNI: ");
        int dni = Pantalla.leerEntero(sc);
        sc.nextLine();

        Pantalla.imprimirMsj("Ingrese los años de experiencia: ");
        int anos_experiencia = Pantalla.leerEntero(sc);
        sc.nextLine();
        
        return new Guarda(nombre, apellido, dni, anos_experiencia);
	}
}
