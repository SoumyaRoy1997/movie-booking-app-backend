package com.mindtree.movieBookingApp.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "theatres")
public class Theatres {

	@Id
	private String id;
	@Indexed
	private String theatreName;
	private int noOfScreens;
	private location location;
	private facilities facilities;
	private events events;
	private List<screens> screens;
	public Theatres() {
		super();
	}
	public Theatres(String id, String theatreName, int noOfScreens,
			com.mindtree.movieBookingApp.entity.location location,
			com.mindtree.movieBookingApp.entity.facilities facilities,
			com.mindtree.movieBookingApp.entity.events events,
			List<com.mindtree.movieBookingApp.entity.screens> screens) {
		super();
		this.id = id;
		this.theatreName = theatreName;
		this.noOfScreens = noOfScreens;
		this.location = location;
		this.facilities = facilities;
		this.events = events;
		this.screens = screens;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public int getNoOfScreens() {
		return noOfScreens;
	}
	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}
	public location getLocation() {
		return location;
	}
	public void setLocation(location location) {
		this.location = location;
	}
	public facilities getFacilities() {
		return facilities;
	}
	public void setFacilities(facilities facilities) {
		this.facilities = facilities;
	}
	public events getEvents() {
		return events;
	}
	public void setEvents(events events) {
		this.events = events;
	}
	public List<screens> getScreens() {
		return screens;
	}
	public void setScreens(List<screens> screens) {
		this.screens = screens;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((events == null) ? 0 : events.hashCode());
		result = prime * result + ((facilities == null) ? 0 : facilities.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + noOfScreens;
		result = prime * result + ((screens == null) ? 0 : screens.hashCode());
		result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
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
		Theatres other = (Theatres) obj;
		if (events == null) {
			if (other.events != null)
				return false;
		} else if (!events.equals(other.events))
			return false;
		if (facilities == null) {
			if (other.facilities != null)
				return false;
		} else if (!facilities.equals(other.facilities))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfScreens != other.noOfScreens)
			return false;
		if (screens == null) {
			if (other.screens != null)
				return false;
		} else if (!screens.equals(other.screens))
			return false;
		if (theatreName == null) {
			if (other.theatreName != null)
				return false;
		} else if (!theatreName.equals(other.theatreName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Theatres [id=" + id + ", theatreName=" + theatreName + ", noOfScreens=" + noOfScreens + ", location="
				+ location + ", facilities=" + facilities + ", events=" + events + ", screens=" + screens + "]";
	}
		
}

