package ej1clase4.Arbia;

public class Movie {
	
	private String title;
	private String director;
	private String actor;
	private int year;
	
	public Movie(String title, String director, String actor, int year) {
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.year = year;
	}
	
	public String getTitle() {return this.title; }

	public String getDirector() {return this.director; }
	
	public String getActor() {return this.actor; }
	
	public int getYear() { return this.year; }

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
