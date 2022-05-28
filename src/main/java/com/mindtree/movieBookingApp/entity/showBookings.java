package com.mindtree.movieBookingApp.entity;



public class showBookings {
	
	private String seat;
	private String bookingId;
	public showBookings(String seat, String bookingId) {
		super();
		this.seat = seat;
		this.bookingId = bookingId;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public showBookings() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime * result + ((seat == null) ? 0 : seat.hashCode());
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
		showBookings other = (showBookings) obj;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (seat == null) {
			if (other.seat != null)
				return false;
		} else if (!seat.equals(other.seat))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "showBookings [seat=" + seat + ", bookingId=" + bookingId + "]";
	}
	

}
