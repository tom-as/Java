package ej1clase4.Arbia;
import java.util.ArrayList;

public class Movie {
	
	private String title;
	private Director director;
	private String actor;
	private int year;
	
	public Movie(String title, Director director, String actor, int year) {
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.year = year;
	}
	
	public String getTitle() {return this.title; }

	public Director getDirector() {
		return this.director;
		}
	
	public String getActor() {return this.actor; }
	
	public int getYear() { return this.year; }

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public static Movie findByTitle(ArrayList<Movie> movieArray, String search) {
		Movie result = null;
		for(int i=0; i<movieArray.size(); i++) {
			Movie tempMovie = movieArray.get(i);
			if(tempMovie.title.equals(search)) {
				result = tempMovie;
				break;
			}
		}
		return result;
	}
	
}
