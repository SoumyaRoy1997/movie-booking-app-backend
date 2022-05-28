package com.mindtree.movieBookingApp.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieBookingApp.entity.Bookings;
import com.mindtree.movieBookingApp.entity.Movies;
import com.mindtree.movieBookingApp.entity.Theatres;
import com.mindtree.movieBookingApp.entity.screens;
import com.mindtree.movieBookingApp.entity.showBookings;
import com.mindtree.movieBookingApp.entity.showTimmings;
import com.mindtree.movieBookingApp.entity.shows;
import com.mindtree.movieBookingApp.exception.NoBookingsException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.repository.BookingsRepo;
import com.mindtree.movieBookingApp.response.bookingResponse;
import com.mindtree.movieBookingApp.services.BookingsService;
import com.mindtree.movieBookingApp.services.MoviesService;
import com.mindtree.movieBookingApp.services.TheatresService;

@Service
public class BookingsServiceImpl implements BookingsService{

	@Autowired
	BookingsRepo repo;
	@Autowired
	TheatresService service;
	@Autowired
	MoviesService movieService;
	
	@Override
	public List<Bookings> getBookings(String userId) throws ServiceException{
		
		List<Bookings> bookings=repo.findAll();
		List<Bookings> list=new ArrayList<Bookings>();
		for(int i=0;i<bookings.size();i++)
		{
			if(bookings.get(i).getUserID().compareTo(userId)==0)
				list.add(bookings.get(i));
		}
		if(list.isEmpty())
			throw new NoBookingsException("There are no Bookings for the User");
		
		return list;
	}

	@Override
	public String postBookings(Bookings booking,String timmingId,List<String> tickets) throws ServiceException {
		String bookingId=repo.save(booking).getId();
		boolean flag=false;
		int i=0;
		Theatres theatre=service.getTheatreById(booking.getTheatreID()).get();
		for (screens screen : theatre.getScreens()) {
			for (shows shows : screen.getShows()) {
				for (showTimmings timming : shows.getShowTimings()) {
					if(timming.getId().compareTo(timmingId)==0) {
						for (String seat : tickets) {
							showBookings bookings=new showBookings(seat, bookingId);
							timming.getShowBookings().add(bookings);
						}
						shows.getShowTimings().get(i).setShowBookings(timming.getShowBookings());
						flag=true;
						break;
					}
					i++;
					if(flag) {
						shows.setShowTimings(shows.getShowTimings());
						break;
					}
				}
			if(flag) {
				screen.setShows(screen.getShows());
				break;
			}
		}
			if(flag) {
				theatre.setScreens(theatre.getScreens());
				break;}}
		service.putTheatres(theatre);
		return bookingId;
	}

	@Override
	public bookingResponse getBookingDetails(String theatreID, String movieID, String timmingID)
			throws ServiceException {
		showTimmings timming=service.findBytimming(timmingID);
		System.out.println(timming.toString());
		Theatres theatre=service.getTheatreById(theatreID).get();
		Movies movie=movieService.getMoviesbyId(movieID).get();
		bookingResponse response= new bookingResponse(movie.getTitle(),theatre.getTheatreName(),theatre.getLocation(),timming.getTimming(),movie.getPoster());
		return response;
	}

}
