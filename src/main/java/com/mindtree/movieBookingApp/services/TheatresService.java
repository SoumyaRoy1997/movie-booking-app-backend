package com.mindtree.movieBookingApp.services;

import java.util.List;
import java.util.Optional;

import com.mindtree.movieBookingApp.entity.Theatres;
import com.mindtree.movieBookingApp.entity.showTimmings;
import com.mindtree.movieBookingApp.exception.ServiceException;

public interface TheatresService {

	List<Theatres> getTheatres(String id)throws ServiceException;
	Optional<Theatres> getTheatreById(String id)throws ServiceException;
	void putTheatres(Theatres theatre)throws ServiceException;
	showTimmings findBytimming(String timmingId)throws ServiceException;
}
