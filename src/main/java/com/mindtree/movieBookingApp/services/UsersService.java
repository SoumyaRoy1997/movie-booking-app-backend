package com.mindtree.movieBookingApp.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.multipart.MultipartFile;

import com.mindtree.movieBookingApp.entity.Users;
import com.mindtree.movieBookingApp.exception.ServiceException;

public interface UsersService extends UserDetailsService{

	Users getLogin(String username)throws ServiceException;

	boolean registerUser(Users user, String role)throws ServiceException;

	void editprofile(Users user)throws ServiceException;

	void addPicture(MultipartFile picture, String id)throws ServiceException;
	
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
