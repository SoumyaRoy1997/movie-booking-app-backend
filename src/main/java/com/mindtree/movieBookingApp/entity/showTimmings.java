package com.mindtree.movieBookingApp.entity;

import java.util.List;


public class showTimmings {
	
	private String id;
	private String timming;
	private List<showBookings> showBookings;
	private double cost;
	
		public showTimmings(String id, String timming, List<com.mindtree.movieBookingApp.entity.showBookings> showBookings,
			double cost) {
		super();
		this.id = id;
		this.timming = timming;
		this.showBookings = showBookings;
		this.cost = cost;
	}
		public showTimmings() {
		super();
	}
	
	public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
	
	public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
	public String getTimming() {
		return timming;
	}
	public void setTimming(String timming) {
		this.timming = timming;
	}
	public List<showBookings> getShowBookings() {
		return showBookings;
	}
	public void setShowBookings(List<showBookings> showBookings) {
		this.showBookings = showBookings;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((showBookings == null) ? 0 : showBookings.hashCode());
		result = prime * result + ((timming == null) ? 0 : timming.hashCode());
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
		showTimmings other = (showTimmings) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (showBookings == null) {
			if (other.showBookings != null)
				return false;
		} else if (!showBookings.equals(other.showBookings))
			return false;
		if (timming == null) {
			if (other.timming != null)
				return false;
		} else if (!timming.equals(other.timming))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "showTimmings [id=" + id + ", timming=" + timming + ", showBookings=" + showBookings + ", cost=" + cost
				+ "]";
	}	
}
