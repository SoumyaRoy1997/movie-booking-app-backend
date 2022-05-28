package com.mindtree.movieBookingApp.servicesImpl;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.catalina.User;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.mindtree.movieBookingApp.entity.Users;
import com.mindtree.movieBookingApp.entity.preferences;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.repository.UsersRepo;
import com.mindtree.movieBookingApp.services.RoleMapService;
import com.mindtree.movieBookingApp.services.UsersService;


@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersRepo repo;
	
	@Autowired
    PasswordEncoder encoder;
	
	@Autowired
	RoleMapService roleService;
	
	@Override
	@Transactional
	public Users getLogin(String username) throws ServiceException {
		Users user=repo.findByUsername(username);
		return user;
	}

	@Override
	@Transactional
	public boolean registerUser(Users user,String role) throws ServiceException {
		if(repo.existsByUsername(user.getUsername())) {
			throw new ServiceException("Username exists!");
	    }

	    Users value = new Users(user.getUsername(), encoder.encode(user.getPassword()),
	    		user.getRolemap(),user.getBookings(),user.getPreferences(),user.getFirstName(),
	    		user.getLastName());

	    
	    value.setRolemap(roleService.getRoleMap(role));
		String id = repo.save(value).getId();
		return true;
	}

	@Override
	public void editprofile(Users user) throws ServiceException {
		repo.save(user);
		
	}

	@Override
	@Transactional
	public void addPicture(MultipartFile picture, String id) throws ServiceException {
		Users user=repo.findById(id).get();
		System.out.println(user.toString());
		try {
			user.setProfilePic(new Binary(BsonBinarySubType.BINARY,picture.getBytes()));
			repo.insert(user);
//			repo.save(user);
		} catch (IOException e) {
			throw new ServiceException("Error in Upload Picture");
		}
		
	}

	

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user= repo.findByUsername(username);
		
		try {
			return UserPrinciple.build(user,roleService.getRole(user.getRolemap()));
		} catch (ServiceException e) {
			return null;
		}
		
	}

	

}
