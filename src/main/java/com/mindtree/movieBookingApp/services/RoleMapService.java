package com.mindtree.movieBookingApp.services;

import com.mindtree.movieBookingApp.exception.ServiceException;

public interface RoleMapService {
	public String getRoleMap(String role) throws ServiceException;
	
	public String getRole(String role) throws ServiceException;

}
