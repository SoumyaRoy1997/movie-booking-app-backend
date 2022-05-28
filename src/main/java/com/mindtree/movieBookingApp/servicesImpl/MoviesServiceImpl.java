package com.mindtree.movieBookingApp.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrixRow;
import com.google.maps.model.TransitMode;
import com.google.maps.model.TravelMode;
import com.mindtree.movieBookingApp.entity.Movies;
import com.mindtree.movieBookingApp.entity.Theatres;
import com.mindtree.movieBookingApp.entity.screens;
import com.mindtree.movieBookingApp.entity.shows;
import com.mindtree.movieBookingApp.exception.ConnectionFailureException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.repository.MoviesRepo;
import com.mindtree.movieBookingApp.services.MoviesService;
import com.mindtree.movieBookingApp.services.TheatresService;

@Service
public class MoviesServiceImpl implements MoviesService{

	@Autowired
	MoviesRepo repo;
	
	@Autowired
	TheatresService service;
	
	@Override
	public List<Movies> getMovies() throws ServiceException {
		List<Movies> movies =repo.findAll(); 
		if(movies.isEmpty())
			throw new ConnectionFailureException("Error in Fetching data from backend. Check your internet connection");
		return movies;
	}

	@Override
	public Optional<Movies> getMoviesbyId(String id) throws ServiceException {
		Optional<Movies> movie = repo.findById(id);
		return movie;
	}

	@Override
	public List<Movies> getMoviesByLanguage(String language) throws ServiceException {
		return repo.findByLanguages(language);
	}

	@Override
	public List<Movies> getMoviesbyTheatre(String origin, int destination,boolean nowShowing) throws ServiceException {
		GeoApiContext context = new GeoApiContext.Builder()
			    .apiKey("AIzaSyB_7P9_cNsHwaSa9H7Onn44ByRLo15ubWc")
			    .build();
		List<Movies> movies=repo.findByNowShowing(nowShowing);
		List<Movies> Resultmovies= new ArrayList<Movies>();
		List<Theatres> theatres=new ArrayList<Theatres>();
		for (Movies movie : movies) {
			theatres.addAll(service.getTheatres(movie.getId()));
		}
		List<Theatres> result=removeDuplicates(theatres);
		for (Theatres theatre : result) {
			try {
				DistanceMatrixRow rows[] = 
						DistanceMatrixApi.getDistanceMatrix(context, new String[]{origin}, new String[]{theatre.getLocation().getAddress().getCity()})
						.mode(TravelMode.TRANSIT)
						.transitModes(TransitMode.BUS, TransitMode.RAIL ,TransitMode.SUBWAY)
						.await().rows;
				System.out.println("Distance is ======================================================="+rows[0].elements[0].distance.inMeters);
				if(rows[0].elements[0].distance.inMeters <= destination) {
					for (screens screen : theatre.getScreens()) {
						for (shows show : screen.getShows()) {
							for (Movies movie : movies) {
								if(movie.getId().toString().equalsIgnoreCase(show.getShowId()) ) {
									Resultmovies.add(movie);
								}
							}
						}
					}
				}
				
				movies = removeDuplicatesMovies(Resultmovies);
				
			} catch (Exception e) {
				throw new ServiceException(e.getMessage());
			}
		}
		
		return movies;
	}
	public static ArrayList<Theatres> removeDuplicates(List<Theatres> theatres) 
    { 
        ArrayList<Theatres> newList = new ArrayList<Theatres>(); 
        for (Theatres element : theatres) { 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
        return newList; 
    } 
	public static ArrayList<Movies> removeDuplicatesMovies(List<Movies> movies) 
    { 
        ArrayList<Movies> newList = new ArrayList<Movies>(); 
        for (Movies element : movies) { 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
        return newList; 
    } 
}
