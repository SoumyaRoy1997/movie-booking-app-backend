package com.mindtree.movieBookingApp.entity;

public class rottenTomatoes {
	
	private int numReviews;
	private double rating;
	
	public rottenTomatoes(int numReviews, double rating) {
		super();
		this.numReviews = numReviews;
		this.rating = rating;
	}

	public rottenTomatoes() {
		super();
	}

	public int getNumReviews() {
		return numReviews;
	}

	public void setNumReviews(int numReviews) {
		this.numReviews = numReviews;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numReviews;
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		rottenTomatoes other = (rottenTomatoes) obj;
		if (numReviews != other.numReviews)
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "rottenTomatoes [numReviews=" + numReviews + ", rating=" + rating + "]";
	}
	
	

}
