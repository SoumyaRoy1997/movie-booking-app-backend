package com.mindtree.movieBookingApp.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "screens")
public class screens {

	@Id
	private String id;
	@Indexed
	private String theater_id;
	private String type;
	private int capacity;
	private List<shows> shows;
	
	
	public screens() {
		super();
	}


	public screens(String id, String theater_id, String type, int capacity,
			List<com.mindtree.movieBookingApp.entity.shows> shows) {
		super();
		this.id = id;
		this.theater_id = theater_id;
		this.type = type;
		this.capacity = capacity;
		this.shows = shows;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTheater_id() {
		return theater_id;
	}


	public void setTheater_id(String theater_id) {
		this.theater_id = theater_id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public List<shows> getShows() {
		return shows;
	}


	public void setShows(List<shows> shows) {
		this.shows = shows;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((shows == null) ? 0 : shows.hashCode());
		result = prime * result + ((theater_id == null) ? 0 : theater_id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		screens other = (screens) obj;
		if (capacity != other.capacity)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (shows == null) {
			if (other.shows != null)
				return false;
		} else if (!shows.equals(other.shows))
			return false;
		if (theater_id == null) {
			if (other.theater_id != null)
				return false;
		} else if (!theater_id.equals(other.theater_id))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "screens [id=" + id + ", theater_id=" + theater_id + ", type=" + type + ", capacity=" + capacity
				+ ", shows=" + shows + "]";
	}

	
}
