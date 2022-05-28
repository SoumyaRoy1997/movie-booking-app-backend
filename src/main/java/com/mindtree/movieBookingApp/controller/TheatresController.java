package com.mindtree.movieBookingApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieBookingApp.entity.Theatres;
import com.mindtree.movieBookingApp.exception.ControllerException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.services.TheatresService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/theatres")
public class TheatresController {
	
	@Autowired
	TheatresService service;
	
	@GetMapping("/{id}")
	public List<Theatres> getTheatres(@PathVariable String id)throws ControllerException{
		try {
			return service.getTheatres(id);
		}
		catch(ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
}
