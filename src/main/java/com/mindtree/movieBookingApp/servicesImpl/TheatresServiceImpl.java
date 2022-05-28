package com.mindtree.movieBookingApp.servicesImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieBookingApp.entity.Theatres;
import com.mindtree.movieBookingApp.entity.screens;
import com.mindtree.movieBookingApp.entity.showTimmings;
import com.mindtree.movieBookingApp.entity.shows;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.repository.TheatresRepo;
import com.mindtree.movieBookingApp.services.TheatresService;

@Service
public class TheatresServiceImpl implements TheatresService{

	@Autowired
	TheatresRepo repo;
	
	@Override
	public List<Theatres> getTheatres(String showid) throws ServiceException {
		
		return repo.findByshowId(showid);
	}

	@Override
	public Optional<Theatres> getTheatreById(String id) throws ServiceException {
		return repo.findById(id);
	}
	@Override
	public void putTheatres(Theatres theatre)throws ServiceException{
		repo.save(theatre);
	}

	@Override
	public showTimmings findBytimming(String timmingId) throws ServiceException {
		
		Theatres theatre= repo.findBytimmingId(timmingId);
		for (screens screen : theatre.getScreens()) {
			for (shows show : screen.getShows()) {
				for (showTimmings timming : show.getShowTimings()) {
					if(timming.getId().toString().compareToIgnoreCase(timmingId)==0) {
						return timming;
					}
				}
			}
		}
		return null;
	}
	
	

}
