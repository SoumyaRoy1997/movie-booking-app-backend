package com.mindtree.movieBookingApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mindtree.movieBookingApp.entity.Movies;

public interface MoviesRepo extends MongoRepository<Movies, String>{
	
	public List<Movies> findByLanguages(@Param("language") String language);
	
	@Query("{'nowShowing':?0 }")
	public List<Movies> findByNowShowing(@Param("nowShowing")Boolean nowShowing);

}
