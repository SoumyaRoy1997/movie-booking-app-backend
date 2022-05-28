package com.mindtree.movieBookingApp.entity;

import java.util.Date;
import java.util.List;

public class sports {

	private String sportsName;
	private List<String> teams;
	private Date date;
	
	public sports() {
		super();
	}
	public sports(String sportsName, List<String> teams, Date date) {
		super();
		this.sportsName = sportsName;
		this.teams = teams;
		this.date = date;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public List<String> getTeams() {
		return teams;
	}
	public void setTeams(List<String> teams) {
		this.teams = teams;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((sportsName == null) ? 0 : sportsName.hashCode());
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
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
		sports other = (sports) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (sportsName == null) {
			if (other.sportsName != null)
				return false;
		} else if (!sportsName.equals(other.sportsName))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "sports [sportsName=" + sportsName + ", teams=" + teams + ", date=" + date + "]";
	}
	
	
}
