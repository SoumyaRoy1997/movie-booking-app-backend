package com.mindtree.movieBookingApp.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movies {
	@Id
	private String id;
	@Indexed
	private String title;
	private int year;
	private String runtime;
	private List<String> cast;
	private boolean nowShowing;
	private String poster;
	private String plot;
	private List<String> directors;
	private List<String> countries;
	private List<String> genres;
	private List<String> languages;
	private String rated;
	private Imdb imdb;
	private rottenTomatoes rottenTomatoes;
	private SocialMedia social_media;
	public Movies(String id, String title, int year, String runtime, List<String> cast, boolean nowShowing,
			String poster, String plot, List<String> directors, List<String> countries, List<String> genres,
			List<String> languages, String rated, Imdb imdb,
			com.mindtree.movieBookingApp.entity.rottenTomatoes rottenTomatoes, SocialMedia social_media) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.cast = cast;
		this.nowShowing = nowShowing;
		this.poster = poster;
		this.plot = plot;
		this.directors = directors;
		this.countries = countries;
		this.genres = genres;
		this.languages = languages;
		this.rated = rated;
		this.imdb = imdb;
		this.rottenTomatoes = rottenTomatoes;
		this.social_media = social_media;
	}
	public Movies() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public List<String> getCast() {
		return cast;
	}
	public void setCast(List<String> cast) {
		this.cast = cast;
	}
	public boolean isNowShowing() {
		return nowShowing;
	}
	public void setNowShowing(boolean nowShowing) {
		this.nowShowing = nowShowing;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public List<String> getDirectors() {
		return directors;
	}
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	public List<String> getCountries() {
		return countries;
	}
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public Imdb getImdb() {
		return imdb;
	}
	public void setImdb(Imdb imdb) {
		this.imdb = imdb;
	}
	public rottenTomatoes getRottenTomatoes() {
		return rottenTomatoes;
	}
	public void setRottenTomatoes(rottenTomatoes rottenTomatoes) {
		this.rottenTomatoes = rottenTomatoes;
	}
	public SocialMedia getSocial_media() {
		return social_media;
	}
	public void setSocial_media(SocialMedia social_media) {
		this.social_media = social_media;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cast == null) ? 0 : cast.hashCode());
		result = prime * result + ((countries == null) ? 0 : countries.hashCode());
		result = prime * result + ((directors == null) ? 0 : directors.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imdb == null) ? 0 : imdb.hashCode());
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		result = prime * result + (nowShowing ? 1231 : 1237);
		result = prime * result + ((plot == null) ? 0 : plot.hashCode());
		result = prime * result + ((poster == null) ? 0 : poster.hashCode());
		result = prime * result + ((rated == null) ? 0 : rated.hashCode());
		result = prime * result + ((rottenTomatoes == null) ? 0 : rottenTomatoes.hashCode());
		result = prime * result + ((runtime == null) ? 0 : runtime.hashCode());
		result = prime * result + ((social_media == null) ? 0 : social_media.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
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
		Movies other = (Movies) obj;
		if (cast == null) {
			if (other.cast != null)
				return false;
		} else if (!cast.equals(other.cast))
			return false;
		if (countries == null) {
			if (other.countries != null)
				return false;
		} else if (!countries.equals(other.countries))
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imdb == null) {
			if (other.imdb != null)
				return false;
		} else if (!imdb.equals(other.imdb))
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (nowShowing != other.nowShowing)
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
		if (rated == null) {
			if (other.rated != null)
				return false;
		} else if (!rated.equals(other.rated))
			return false;
		if (rottenTomatoes == null) {
			if (other.rottenTomatoes != null)
				return false;
		} else if (!rottenTomatoes.equals(other.rottenTomatoes))
			return false;
		if (runtime == null) {
			if (other.runtime != null)
				return false;
		} else if (!runtime.equals(other.runtime))
			return false;
		if (social_media == null) {
			if (other.social_media != null)
				return false;
		} else if (!social_media.equals(other.social_media))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", year=" + year + ", runtime=" + runtime + ", cast=" + cast
				+ ", nowShowing=" + nowShowing + ", poster=" + poster + ", plot=" + plot + ", directors=" + directors
				+ ", countries=" + countries + ", genres=" + genres + ", languages=" + languages + ", rated=" + rated
				+ ", imdb=" + imdb + ", rottenTomatoes=" + rottenTomatoes + ", social_media=" + social_media + "]";
	}
	
	

}
