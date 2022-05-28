package com.mindtree.movieBookingApp.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import com.mindtree.movieBookingApp.entity.Users;
import com.mindtree.movieBookingApp.exception.ControllerException;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.response.JwtResponse;
import com.mindtree.movieBookingApp.response.movieBookingResponse;
import com.mindtree.movieBookingApp.security.jwt.JwtProvider;
import com.mindtree.movieBookingApp.services.UsersService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class UsersController {
	
	@Autowired
    AuthenticationManager authenticationManager;
	
	@Autowired
	UsersService service;
	
    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtProvider jwtProvider;
    
    AuthenticationManagerBuilder authenticationManagerBuilder;
	
	@PostMapping("/login")
	public ResponseEntity<?> getAuth(@RequestBody Users user)
	{
		UsernamePasswordAuthenticationToken authenticationToken =new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword())	;
		System.out.println(authenticationToken);
		 Authentication authentication = authenticationManager.authenticate(authenticationToken);
	      SecurityContextHolder.getContext().setAuthentication(authentication);
		        String jwt = jwtProvider.generateJwtToken(authentication);
		        return ResponseEntity.ok(new JwtResponse(jwt , authentication.getAuthorities() , authenticationToken.getPrincipal().toString()));
	}
	
	@PostMapping("/register/{role}")
	public ResponseEntity<?> registerUser(@RequestBody Users user,@PathVariable String role)throws ControllerException
	{	 
		try{
			service.registerUser(user, role);
		}
		catch (ServiceException e) {
			 return new ResponseEntity<String>(e.getMessage(),
		                HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(new movieBookingResponse("User registered successfully!"));
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<?> getCurrentUser(@PathVariable String username)throws ControllerException{
		
		try {
			Users value=service.getLogin(username);
			return new ResponseEntity<Users>(value,HttpStatus.OK);
		}
		catch (ServiceException e) {
			return new ResponseEntity<String>(e.getMessage(),
	                HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/edit-profile")
	public ResponseEntity<?> editProfile(@RequestBody Users user)throws ControllerException{
		try {
			service.editprofile(user);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
	@PutMapping("/upload-pic/{id}")
	public ResponseEntity<?> uploadPicture(@RequestBody MultipartFile picture,@PathVariable String id)throws ControllerException{
		try {
			service.addPicture(picture,id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
}
