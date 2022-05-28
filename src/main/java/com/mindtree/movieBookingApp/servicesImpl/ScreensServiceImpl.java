package com.mindtree.movieBookingApp.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieBookingApp.entity.screens;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.repository.ScreensRepo;
import com.mindtree.movieBookingApp.services.ScreensService;

@Service
public class ScreensServiceImpl implements ScreensService{
	
	@Autowired
	ScreensRepo repo;
	
	@Override
	public List<screens> getScreens(String id) throws ServiceException {
		return repo.findByShowId(id);
	}

}
