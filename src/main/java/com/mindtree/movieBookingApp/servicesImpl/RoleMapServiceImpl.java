package com.mindtree.movieBookingApp.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.repository.RoleMapRepo;
import com.mindtree.movieBookingApp.services.RoleMapService;

@Service
public class RoleMapServiceImpl implements RoleMapService{

	@Autowired
	RoleMapRepo repo;
	
	
	public String getRoleMap(String role) throws ServiceException{
		return repo.findByRole(role).getRolemap().toString();
	}

	@Override
	public String getRole(String role) throws ServiceException {
		return repo.findByRolemap(role).getRole().toString();
	}
}
