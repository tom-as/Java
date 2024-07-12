package arbia.Final;
import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	
	public Empleado(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public void mostrarDetalle() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("DNI: " + this.dni);
	}
	
	public static Empleado buscarPorDNI(ArrayList<Empleado> empleados, int dni) 
	{
		Empleado empleadoBuscado = null;
		for(Empleado empleado : empleados) 
		{
			int dniEmpleado = empleado.getDni();
			if(dniEmpleado == dni) {
				empleadoBuscado = empleado;
			}
		}		
		return empleadoBuscado;		
	}
	
}
