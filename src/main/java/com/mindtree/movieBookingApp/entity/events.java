package com.mindtree.movieBookingApp.entity;

import java.util.List;

public class events {

	private List<sports> sports;
	private List<theatrePlay> theatre_play;
	
	public events() {
		super();
	}
	public events(List<com.mindtree.movieBookingApp.entity.sports> sports, List<theatrePlay> theatre_play) {
		super();
		this.sports = sports;
		this.theatre_play = theatre_play;
	}
	public List<sports> getSports() {
		return sports;
	}
	public void setSports(List<sports> sports) {
		this.sports = sports;
	}
	public List<theatrePlay> getTheatre_play() {
		return theatre_play;
	}
	public void setTheatre_play(List<theatrePlay> theatre_play) {
		this.theatre_play = theatre_play;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sports == null) ? 0 : sports.hashCode());
		result = prime * result + ((theatre_play == null) ? 0 : theatre_play.hashCode());
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
		events other = (events) obj;
		if (sports == null) {
			if (other.sports != null)
				return false;
		} else if (!sports.equals(other.sports))
			return false;
		if (theatre_play == null) {
			if (other.theatre_play != null)
				return false;
		} else if (!theatre_play.equals(other.theatre_play))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "events [sports=" + sports + ", theatre_play=" + theatre_play + "]";
	}
		
}
