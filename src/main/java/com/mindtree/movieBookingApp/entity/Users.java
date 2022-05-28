package com.mindtree.movieBookingApp.entity;

import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "users")
public class Users {
	
	@Id
	private String id;
	@Indexed
	private String username;
	private String password;
	private String rolemap;
	private List<String> bookings;
	private preferences preferences;
	private String firstName;
	private String lastName;
	@JsonIgnore
	private Binary profilePic;
	@Transient
	private String otp;
	
	public Users() {
		super();
	}
	
	public Users(String username, String password, String rolemap, List<String> bookings,
			com.mindtree.movieBookingApp.entity.preferences preferences, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.rolemap = rolemap;
		this.bookings = bookings;
		this.preferences = preferences;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Users(String id, String username, String password, String rolemap, List<String> bookings,
			com.mindtree.movieBookingApp.entity.preferences preferences, String firstName, String lastName,
			Binary profilePic, String otp) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rolemap = rolemap;
		this.bookings = bookings;
		this.preferences = preferences;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePic = profilePic;
		this.otp = otp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRolemap() {
		return rolemap;
	}
	public void setRolemap(String rolemap) {
		this.rolemap = rolemap;
	}
	public List<String> getBookings() {
		return bookings;
	}
	public void setBookings(List<String> bookings) {
		this.bookings = bookings;
	}
	
	public preferences getPreferences() {
		return preferences;
	}

	public void setPreferences(preferences preferences) {
		this.preferences = preferences;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Binary getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(Binary profilePic) {
		this.profilePic = profilePic;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookings == null) ? 0 : bookings.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((otp == null) ? 0 : otp.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((preferences == null) ? 0 : preferences.hashCode());
		result = prime * result + ((profilePic == null) ? 0 : profilePic.hashCode());
		result = prime * result + ((rolemap == null) ? 0 : rolemap.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Users other = (Users) obj;
		if (bookings == null) {
			if (other.bookings != null)
				return false;
		} else if (!bookings.equals(other.bookings))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (otp == null) {
			if (other.otp != null)
				return false;
		} else if (!otp.equals(other.otp))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (preferences == null) {
			if (other.preferences != null)
				return false;
		} else if (!preferences.equals(other.preferences))
			return false;
		if (profilePic == null) {
			if (other.profilePic != null)
				return false;
		} else if (!profilePic.equals(other.profilePic))
			return false;
		if (rolemap == null) {
			if (other.rolemap != null)
				return false;
		} else if (!rolemap.equals(other.rolemap))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", rolemap=" + rolemap
				+ ", bookings=" + bookings + ", preferences=" + preferences + ", firstName=" + firstName + ", lastName="
				+ lastName + ", profilePic=" + profilePic + ", otp=" + otp + "]";
	}
	
}
