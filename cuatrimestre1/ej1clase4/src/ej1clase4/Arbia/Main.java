package ej1clase4.Arbia;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movies = new ArrayList<>();
		
		boolean isTypingMovie = true;
		
		while (isTypingMovie) {
			movies.add(readMovie());
			isTypingMovie = willContinue();			
		}
		showMovies(movies);
		
	}
	
	public static Movie readMovie() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el titulo: ");
		String title = sc.nextLine();
		System.out.println("Ingrese el director: ");
		String director = sc.nextLine();
		System.out.println("Ingrese el actor: ");
		String actor = sc.nextLine();
		System.out.println("Ingrese el anio: ");
		int year = sc.nextInt();
		
		  
		Movie currentMovie = new Movie(title, director, actor, year) ;
		return currentMovie;
		
	}
	
	public static boolean willContinue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quiere continuar?(0=NO, 1=SI)");
		int userInput = sc.nextInt();
		boolean willContinue = false;
		if(userInput == 0) {willContinue = false;}
		else if(userInput == 1) {willContinue = true;}
		else {
			System.out.println("Error, las opciones son 0 o 1.");
			willContinue();
		}
		
		return willContinue;
	}
	
	public static void showMovies(ArrayList<Movie> movieArray) {
		for (int i = 0; i < movieArray.size(); i++) {
            System.out.println(movieArray.get(i).getTitle());
            System.out.println(movieArray.get(i).getDirector());
            System.out.println(movieArray.get(i).getActor());
            System.out.println(movieArray.get(i).getYear());
            System.out.println("------");
        }
		
	}

}

