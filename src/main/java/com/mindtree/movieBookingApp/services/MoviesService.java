package com.mindtree.movieBookingApp.services;

import java.util.List;
import java.util.Optional;

import com.mindtree.movieBookingApp.entity.Movies;
import com.mindtree.movieBookingApp.exception.ServiceException;

public interface MoviesService {

	List<Movies> getMovies() throws ServiceException;

	Optional<Movies> getMoviesbyId(String id) throws ServiceException;

	List<Movies> getMoviesByLanguage(String language) throws ServiceException;

	List<Movies> getMoviesbyTheatre(String origin, int destination,boolean nowShowing) throws ServiceException;

}
