package com.mindtree.movieBookingApp.services;

import java.util.List;

import com.mindtree.movieBookingApp.entity.screens;
import com.mindtree.movieBookingApp.exception.ServiceException;

public interface ScreensService {

	List<screens> getScreens(String movieId)throws ServiceException;

}
