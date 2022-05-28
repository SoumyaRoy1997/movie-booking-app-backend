package com.mindtree.movieBookingApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.movieBookingApp.entity.Theatres;
import com.mindtree.movieBookingApp.entity.showTimmings;

@Repository
@Transactional
public interface TheatresRepo extends MongoRepository<Theatres, String>{
	
	@Query("{'screens.shows.showId':?0 }")
	public List<Theatres> findByshowId(@Param("showId") String showId);
	
	@Query("{'screens.shows.showTimings.id':?0 }")
	public Theatres findBytimmingId(@Param("timmingId") String timmingId);

}
