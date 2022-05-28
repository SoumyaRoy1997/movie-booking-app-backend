package com.mindtree.movieBookingApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieBookingApp.entity.Movies;
import com.mindtree.movieBookingApp.exception.ControllerException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.services.MoviesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	MoviesService service;
	
	@GetMapping
	public List<Movies> getMovies()throws ControllerException{
		try
		{
			return service.getMovies();
		}
		catch(ServiceException e)
		{
			throw new ControllerException(e.getMessage());
		}
	}
	
	@GetMapping("/{id}")
	public Optional<Movies> getMovieById(@PathVariable String id)throws ControllerException{
		try {
			return service.getMoviesbyId(id);
		}
		catch(ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
	@GetMapping("/language")
	public List<Movies> getMoviesByLanguage(@RequestParam("language") String language)throws ControllerException{
		try {
			return service.getMoviesByLanguage(language);
		}
		catch(ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
	
	@GetMapping("/distance/{nowShowing}")
	public ResponseEntity<?> getMoviesbyTheatre(@RequestParam("origin")String origin , @RequestParam("destination")int destination, @PathVariable boolean nowShowing)throws ControllerException{
		try {
			List<Movies> movies= service.getMoviesbyTheatre(origin,destination,nowShowing);
			return new ResponseEntity(movies,HttpStatus.OK);
		}
		catch (ServiceException e) {
			return new ResponseEntity(HttpStatus.OK);
		}
	}

}
