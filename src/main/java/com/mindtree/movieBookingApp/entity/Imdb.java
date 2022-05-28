package com.mindtree.movieBookingApp.entity;

public class Imdb {
	
	private int votes;
	private double rating;
	
	public Imdb(int votes, double rating) {
		super();
		this.votes = votes;
		this.rating = rating;
	}

	public Imdb() {
		super();
	}
	
	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
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
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + votes;
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
		Imdb other = (Imdb) obj;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (votes != other.votes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Imdb [votes=" + votes + ", rating=" + rating + "]";
	}
	
	

}
