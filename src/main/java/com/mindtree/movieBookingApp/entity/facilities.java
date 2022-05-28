package com.mindtree.movieBookingApp.entity;

public class facilities {
	
	private boolean parking;
	private boolean food;
	private boolean bags;
	
	public facilities() {
		super();
	}
	public facilities(boolean parking, boolean food, boolean bags) {
		super();
		this.parking = parking;
		this.food = food;
		this.bags = bags;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public boolean isBags() {
		return bags;
	}
	public void setBags(boolean bags) {
		this.bags = bags;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bags ? 1231 : 1237);
		result = prime * result + (food ? 1231 : 1237);
		result = prime * result + (parking ? 1231 : 1237);
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
		facilities other = (facilities) obj;
		if (bags != other.bags)
			return false;
		if (food != other.food)
			return false;
		if (parking != other.parking)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "facilities [parking=" + parking + ", food=" + food + ", bags=" + bags + "]";
	}
	
	

}
