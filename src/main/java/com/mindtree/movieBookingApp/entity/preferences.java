package com.mindtree.movieBookingApp.entity;

import java.util.List;

public class preferences {

	private List<String> genre;
	private List<String> language;
	private List<String> theatre;
	private List<payment> savedPayments;
	public preferences() {
		super();
	}

	public List<payment> getSavedPayments() {
		return savedPayments;
	}
	public void setSavedPayments(List<payment> savedPayments) {
		this.savedPayments = savedPayments;
	}


	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public List<String> getTheatre() {
		return theatre;
	}

	public void setTheatre(List<String> theatre) {
		this.theatre = theatre;
	}

	public preferences(List<String> genre, List<String> language, List<String> theatre, List<payment> savedPayments) {
		super();
		this.genre = genre;
		this.language = language;
		this.theatre = theatre;
		this.savedPayments = savedPayments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((savedPayments == null) ? 0 : savedPayments.hashCode());
		result = prime * result + ((theatre == null) ? 0 : theatre.hashCode());
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
		preferences other = (preferences) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (savedPayments == null) {
			if (other.savedPayments != null)
				return false;
		} else if (!savedPayments.equals(other.savedPayments))
			return false;
		if (theatre == null) {
			if (other.theatre != null)
				return false;
		} else if (!theatre.equals(other.theatre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "preferences [genre=" + genre + ", language=" + language + ", theatre=" + theatre + ", savedPayments="
				+ savedPayments + "]";
	}
	
}
