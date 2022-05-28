package com.mindtree.movieBookingApp.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.movieBookingApp.entity.screens;

@Repository
@Transactional
public interface ScreensRepo extends MongoRepository<screens, String>{
	
	@Query("{'shows.showId':?0}")
	public List<screens> findByShowId(@Param("id") String id);

}
