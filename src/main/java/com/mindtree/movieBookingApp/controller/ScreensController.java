package com.mindtree.movieBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieBookingApp.entity.screens;
import com.mindtree.movieBookingApp.exception.ControllerException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.services.ScreensService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/screens")
public class ScreensController {
	
	@Autowired
	ScreensService service;
	
	@GetMapping("/{movieId}")
	public List<screens> getScreens(@PathVariable String movieId) throws ControllerException{
		
		try {
			return service.getScreens(movieId);
		}
		catch(ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}

}
