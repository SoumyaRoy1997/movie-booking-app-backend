package com.mindtree.movieBookingApp.servicesImpl;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.movieBookingApp.entity.Users;
import com.mindtree.movieBookingApp.entity.preferences;
import com.mindtree.movieBookingApp.exception.ServiceException;
import com.mindtree.movieBookingApp.services.RoleMapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserPrinciple implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String id;

    private String firstName;

    private String lastName;
    
    private String username;

    private List<String> bookings;
    
	private preferences preferences;
    
    @JsonIgnore
    private String password;

    private List<GrantedAuthority> authorities;
    

    public UserPrinciple(String id, String firstName, String lastName, String username, List<String> bookings,
			com.mindtree.movieBookingApp.entity.preferences preferences, String password,
			List<GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.bookings = bookings;
		this.preferences = preferences;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserPrinciple build(Users user,String role) throws ServiceException {
		System.out.println(user.toString());
		 List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		 authorities.add(new SimpleGrantedAuthority(role));
		 
        return new UserPrinciple(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getUsername(),
                user.getBookings(),
                user.getPreferences(),
                user.getPassword(),
                authorities
        );
    }

    
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String getUsername() {
		return username;
	}

	public List<String> getBookings() {
		return bookings;
	}

	public preferences getPreferences() {
		return preferences;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public List<GrantedAuthority> getAuthorities() {
		return authorities;
	}


	@Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorities == null) ? 0 : authorities.hashCode());
		result = prime * result + ((bookings == null) ? 0 : bookings.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((preferences == null) ? 0 : preferences.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPrinciple other = (UserPrinciple) obj;
		if (authorities == null) {
			if (other.authorities != null)
				return false;
		} else if (!authorities.equals(other.authorities))
			return false;
		if (bookings == null) {
			if (other.bookings != null)
				return false;
		} else if (!bookings.equals(other.bookings))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (preferences == null) {
			if (other.preferences != null)
				return false;
		} else if (!preferences.equals(other.preferences))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}