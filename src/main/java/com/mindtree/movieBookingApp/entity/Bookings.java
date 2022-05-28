package com.mindtree.movieBookingApp.entity;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings" )
public class Bookings {
	
	@Id
	private String id;
	@Indexed
	private String userID;
	private String theatreID;
	private String movieID;
	private String screenID;
	private String timmingID;
	private double price;
	private int noOfTickets;
	private Date bookingDate;
	private payment payment;
	public Bookings(String id, String userID, String theatreID, String movieID, String screenID, String timmingID,
			double price, int noOfTickets, Date bookingDate, com.mindtree.movieBookingApp.entity.payment payment) {
		super();
		this.id = id;
		this.userID = userID;
		this.theatreID = theatreID;
		this.movieID = movieID;
		this.screenID = screenID;
		this.timmingID = timmingID;
		this.price = price;
		this.noOfTickets = noOfTickets;
		this.bookingDate = bookingDate;
		this.payment = payment;
	}
	public Bookings() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getTheatreID() {
		return theatreID;
	}
	public void setTheatreID(String theatreID) {
		this.theatreID = theatreID;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getScreenID() {
		return screenID;
	}
	public void setScreenID(String screenID) {
		this.screenID = screenID;
	}
	public String getTimmingID() {
		return timmingID;
	}
	public void setTimmingID(String timmingID) {
		this.timmingID = timmingID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public payment getPayment() {
		return payment;
	}
	public void setPayment(payment payment) {
		this.payment = payment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((movieID == null) ? 0 : movieID.hashCode());
		result = prime * result + noOfTickets;
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((screenID == null) ? 0 : screenID.hashCode());
		result = prime * result + ((theatreID == null) ? 0 : theatreID.hashCode());
		result = prime * result + ((timmingID == null) ? 0 : timmingID.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
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
		Bookings other = (Bookings) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (movieID == null) {
			if (other.movieID != null)
				return false;
		} else if (!movieID.equals(other.movieID))
			return false;
		if (noOfTickets != other.noOfTickets)
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (screenID == null) {
			if (other.screenID != null)
				return false;
		} else if (!screenID.equals(other.screenID))
			return false;
		if (theatreID == null) {
			if (other.theatreID != null)
				return false;
		} else if (!theatreID.equals(other.theatreID))
			return false;
		if (timmingID == null) {
			if (other.timmingID != null)
				return false;
		} else if (!timmingID.equals(other.timmingID))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bookings [id=" + id + ", userID=" + userID + ", theatreID=" + theatreID + ", movieID=" + movieID
				+ ", screenID=" + screenID + ", timmingID=" + timmingID + ", price=" + price + ", noOfTickets="
				+ noOfTickets + ", bookingDate=" + bookingDate + ", payment=" + payment + "]";
	} 
	
	

}
