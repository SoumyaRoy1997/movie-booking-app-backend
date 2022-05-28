package com.mindtree.movieBookingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieBookingApp.entity.Bookings;
import com.mindtree.movieBookingApp.exception.ControllerException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.response.bookingResponse;
import com.mindtree.movieBookingApp.response.movieBookingResponse;
import com.mindtree.movieBookingApp.services.BookingsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	BookingsService service;

	@GetMapping("/{userID}")
	public List<Bookings> getBookings(@PathVariable String userID) throws ControllerException
	{
		try {
			return service.getBookings(userID);
		} catch (ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
	
	@PostMapping("/{timmingId}")
	public ResponseEntity<?> postBooking(@RequestBody Bookings booking,@PathVariable String timmingId,@RequestParam(name="tickets") List<String> tickets)throws ControllerException{
		try {
			String id=service.postBookings(booking,timmingId,tickets);
			return new ResponseEntity<>(new movieBookingResponse(200,id),HttpStatus.OK);
		}
		catch(ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
	@GetMapping("/details/{theatreID}")
	public ResponseEntity<?> getBookingDetails(@PathVariable String theatreID, @RequestParam(name="movieID")String movieID,@RequestParam(name="timmingID")String timmingID)throws ControllerException{
			try {
				bookingResponse reponse= service.getBookingDetails(theatreID,movieID,timmingID);
				return new ResponseEntity<bookingResponse>(reponse,HttpStatus.OK);
			}catch (ServiceException e) {
				return new ResponseEntity(HttpStatus.BAD_REQUEST);			}
	}
}
