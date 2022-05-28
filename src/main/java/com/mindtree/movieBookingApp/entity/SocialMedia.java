package com.mindtree.movieBookingApp.entity;

public class SocialMedia {

	private String facebook;
	private String instagram;
	private String twitter;
	
	public SocialMedia(String facebook, String instagram, String twitter) {
		super();
		this.facebook = facebook;
		this.instagram = instagram;
		this.twitter = twitter;
	}
	
	public SocialMedia() {
		super();
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facebook == null) ? 0 : facebook.hashCode());
		result = prime * result + ((instagram == null) ? 0 : instagram.hashCode());
		result = prime * result + ((twitter == null) ? 0 : twitter.hashCode());
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
		SocialMedia other = (SocialMedia) obj;
		if (facebook == null) {
			if (other.facebook != null)
				return false;
		} else if (!facebook.equals(other.facebook))
			return false;
		if (instagram == null) {
			if (other.instagram != null)
				return false;
		} else if (!instagram.equals(other.instagram))
			return false;
		if (twitter == null) {
			if (other.twitter != null)
				return false;
		} else if (!twitter.equals(other.twitter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SocialMedia [facebook=" + facebook + ", instagram=" + instagram + ", twitter=" + twitter + "]";
	}
	
	
}
