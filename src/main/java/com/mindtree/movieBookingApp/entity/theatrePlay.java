package com.mindtree.movieBookingApp.entity;

import java.util.Date;
import java.util.List;


public class theatrePlay {

	private String title;
	private List<String> cast;
	private List<String> directors;
	private List<String> languages;
	private String plot;
	private String poster;
	private List<String> genres;
	private Date screening_date;
	
	public theatrePlay() {
		super();
	}

	public theatrePlay(String title, List<String> cast, List<String> directors, List<String> languages, String plot,
			String poster, List<String> genres, Date screening_date) {
		super();
		this.title = title;
		this.cast = cast;
		this.directors = directors;
		this.languages = languages;
		this.plot = plot;
		this.poster = poster;
		this.genres = genres;
		this.screening_date = screening_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public Date getScreening_date() {
		return screening_date;
	}

	public void setScreening_date(Date screening_date) {
		this.screening_date = screening_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cast == null) ? 0 : cast.hashCode());
		result = prime * result + ((directors == null) ? 0 : directors.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		result = prime * result + ((plot == null) ? 0 : plot.hashCode());
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result + ((screening_date == null) ? 0 : screening_date.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		theatrePlay other = (theatrePlay) obj;
		if (cast == null) {
			if (other.cast != null)
				return false;
		} else if (!cast.equals(other.cast))
			return false;
		if (directors == null) {
			if (other.directors != null)
				return false;
		} else if (!directors.equals(other.directors))
			return false;
		if (genres == null) {
			if (other.genres != null)
				return false;
		} else if (!genres.equals(other.genres))
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (plot == null) {
			if (other.plot != null)
				return false;
		} else if (!plot.equals(other.plot))
			return false;
		if (poster == null) {
			if (other.poster != null)
				return false;
		} else if (!poster.equals(other.poster))
			return false;
		if (screening_date == null) {
			if (other.screening_date != null)
				return false;
		} else if (!screening_date.equals(other.screening_date))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "theatrePlay [title=" + title + ", cast=" + cast + ", directors=" + directors + ", languages="
				+ languages + ", plot=" + plot + ", poster=" + poster + ", genres=" + genres + ", screening_date="
				+ screening_date + "]";
	}
	
	
	
}
