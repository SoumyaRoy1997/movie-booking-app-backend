package com.mindtree.movieBookingApp.entity;


public class location {
	
	private address address;
	private geo geo;
	
	
	public location() {
		super();
	}
	public location(address address,
			geo geo) {
		super();
		this.address = address;
		this.geo = geo;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public geo getGeo() {
		return geo;
	}
	public void setGeo(geo geo) {
		this.geo = geo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((geo == null) ? 0 : geo.hashCode());
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
		location other = (location) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (geo == null) {
			if (other.geo != null)
				return false;
		} else if (!geo.equals(other.geo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "location [address=" + address + ", geo=" + geo + "]";
	}
}
