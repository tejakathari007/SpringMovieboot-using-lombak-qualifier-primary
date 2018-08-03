package com.stackroute.movieservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	MovieRepository movierepository;

	@Autowired
	public MovieServiceImpl(MovieRepository movierepository) {
		this.movierepository = movierepository;
	}

	@Override
	public Movie saveMovie(Movie movie) {
		Movie savedMovie = movierepository.save(movie);
		return savedMovie;
	}

	@Override
	public List<Movie> getAllMovies() {

		List<Movie> movieList = (List<Movie>) movierepository.findAll();
		return movieList;
	}

}
