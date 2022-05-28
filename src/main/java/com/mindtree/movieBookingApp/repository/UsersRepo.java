package com.mindtree.movieBookingApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.movieBookingApp.entity.Users;

@Repository
@Transactional
public interface UsersRepo extends MongoRepository<Users, String>{
	
	public Users findByUsernameAndPassword(@Param("username")String username,@Param("password") String password);
	
	public Users findByUsername(@Param("username")String username);
	
	public Boolean existsByUsername(String username);

}
