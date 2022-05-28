package com.mindtree.movieBookingApp.services;

import java.util.List;



import com.mindtree.movieBookingApp.entity.Bookings;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.response.bookingResponse;

public interface BookingsService {

	List<Bookings> getBookings(String userID)throws ServiceException;

	String postBookings(Bookings booking, String timmingId, List<String> tickets)throws ServiceException;

	bookingResponse getBookingDetails(String theatreID, String movieID, String timmingID)throws ServiceException;

}
