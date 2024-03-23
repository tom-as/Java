package ejercicio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero");
		Scanner sc = new Scanner(System.in);
		int numUno = sc.nextInt();
		System.out.println("Ingrese otro numero");
		int numDos = sc.nextInt();
		System.out.println("Ingrese la operacion (1 = suma, 2= resta, 3= mult");
		int operacion = sc.nextInt();
		
		

		
	}
	
	public static void sum(int num, int num2) {
		int res = num+num2;
		System.out.println("Suma= " + res);
	}
	public static int sub(int num, int num2) {
		int sub = num+num2;
		return sub;System.out.println("Suma= " + res);
	}
	public static int mult(int num, int num2) {
		int mult = num+num2;
		return mult;
	}
}
