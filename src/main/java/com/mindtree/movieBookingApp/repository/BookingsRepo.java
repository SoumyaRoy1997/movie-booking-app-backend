package com.mindtree.movieBookingApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.movieBookingApp.entity.Bookings;

@Repository
@Transactional
public interface BookingsRepo extends MongoRepository<Bookings, String>{
	
	public List<Bookings> findByuserID(@Param("userID")String userID);

}
