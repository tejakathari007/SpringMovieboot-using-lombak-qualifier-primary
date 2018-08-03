package com.stackroute.movieservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	private String movieTitle;
	private int movieRating;
	private long movieYor;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public Movie(int movieId, String movieTitle, int movieRating, long movieYor) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
		this.movieYor = movieYor;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getMovieYor() {
		return movieYor;
	}

	public void setMovieYor(long movieYor) {
		this.movieYor = movieYor;
	}

}
