package com.mindtree.movieBookingApp.entity;

import java.util.Date;
import java.util.List;

public class shows {

	private String type;
	private String duration;
	private String showId;
	private Date first_screening;
	private Date last_screening;
	private List<showTimmings> showTimings;
	
	public shows() {
		super();
	}

	public shows(String type, String duration, String showId, Date first_screening, Date last_screening,
			List<showTimmings> showTimings) {
		super();
		this.type = type;
		this.duration = duration;
		this.showId = showId;
		this.first_screening = first_screening;
		this.last_screening = last_screening;
		this.showTimings = showTimings;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public Date getFirst_screening() {
		return first_screening;
	}

	public void setFirst_screening(Date first_screening) {
		this.first_screening = first_screening;
	}

	public Date getLast_screening() {
		return last_screening;
	}

	public void setLast_screening(Date last_screening) {
		this.last_screening = last_screening;
	}

	public List<showTimmings> getShowTimings() {
		return showTimings;
	}

	public void setShowTimings(List<showTimmings> showTimings) {
		this.showTimings = showTimings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((first_screening == null) ? 0 : first_screening.hashCode());
		result = prime * result + ((last_screening == null) ? 0 : last_screening.hashCode());
		result = prime * result + ((showId == null) ? 0 : showId.hashCode());
		result = prime * result + ((showTimings == null) ? 0 : showTimings.hashCode());
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
		shows other = (shows) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (first_screening == null) {
			if (other.first_screening != null)
				return false;
		} else if (!first_screening.equals(other.first_screening))
			return false;
		if (last_screening == null) {
			if (other.last_screening != null)
				return false;
		} else if (!last_screening.equals(other.last_screening))
			return false;
		if (showId == null) {
			if (other.showId != null)
				return false;
		} else if (!showId.equals(other.showId))
			return false;
		if (showTimings == null) {
			if (other.showTimings != null)
				return false;
		} else if (!showTimings.equals(other.showTimings))
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
		return "shows [type=" + type + ", duration=" + duration + ", showId=" + showId + ", first_screening="
				+ first_screening + ", last_screening=" + last_screening + ", showTimings=" + showTimings + "]";
	}
	
	
}
