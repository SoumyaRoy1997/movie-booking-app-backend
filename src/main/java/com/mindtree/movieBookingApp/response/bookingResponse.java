package com.mindtree.movieBookingApp.response;

import com.mindtree.movieBookingApp.entity.location;

public class bookingResponse {

	private String movieName;
	private String theatreName;
	private location theatreAddress;
	private String time;
	private String poster;
	
	public bookingResponse(String movieName, String theatreName, location theatreAddress, String time, String poster) {
		super();
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.theatreAddress = theatreAddress;
		this.time = time;
		this.poster = poster;
	}
	public bookingResponse() {
		super();
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public location getTheatreAddress() {
		return theatreAddress;
	}
	public void setTheatreAddress(location theatreAddress) {
		this.theatreAddress = theatreAddress;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result + ((theatreAddress == null) ? 0 : theatreAddress.hashCode());
		result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		bookingResponse other = (bookingResponse) obj;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (poster == null) {
			if (other.poster != null)
				return false;
		} else if (!poster.equals(other.poster))
			return false;
		if (theatreAddress == null) {
			if (other.theatreAddress != null)
				return false;
		} else if (!theatreAddress.equals(other.theatreAddress))
			return false;
		if (theatreName == null) {
			if (other.theatreName != null)
				return false;
		} else if (!theatreName.equals(other.theatreName))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "bookingResponse [movieName=" + movieName + ", theatreName=" + theatreName + ", theatreAddress="
				+ theatreAddress + ", time=" + time + ", poster=" + poster + "]";
	}
	
	
}
