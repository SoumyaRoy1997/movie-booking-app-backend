package com.mindtree.movieBookingApp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rolemap")
public class RoleMap {
	
	@Id
	private String id;
	@Indexed
	private String role;
	private String rolemap;
	
	public RoleMap(String id, String role, String rolemap) {
		super();
		this.id = id;
		this.role = role;
		this.rolemap = rolemap;
	}
	
	public RoleMap() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRolemap() {
		return rolemap;
	}

	public void setRolemap(String rolemap) {
		this.rolemap = rolemap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((rolemap == null) ? 0 : rolemap.hashCode());
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
		RoleMap other = (RoleMap) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (rolemap == null) {
			if (other.rolemap != null)
				return false;
		} else if (!rolemap.equals(other.rolemap))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RoleMap [id=" + id + ", role=" + role + ", rolemap=" + rolemap + "]";
	}

	
	

}
