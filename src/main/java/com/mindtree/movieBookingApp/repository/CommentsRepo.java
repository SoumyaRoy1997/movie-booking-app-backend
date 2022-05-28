package com.mindtree.movieBookingApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.movieBookingApp.entity.Comments;

@Repository
@Transactional
public interface CommentsRepo extends MongoRepository<Comments, String>{

}
