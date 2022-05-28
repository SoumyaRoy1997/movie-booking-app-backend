package com.mindtree.movieBookingApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.movieBookingApp.entity.RoleMap;

@Repository
@Transactional
public interface RoleMapRepo extends MongoRepository<RoleMap, String>{
	
	public RoleMap findByRole(@Param("role")String role);
	
	public RoleMap findByRolemap(@Param("role")String role);

}
