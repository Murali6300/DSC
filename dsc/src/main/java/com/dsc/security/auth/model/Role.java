package com.dsc.security.auth.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "role")
public class Role {

	@Id
	private String id;
//	private Integer role_id;
//	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public Integer getRole_id() {
//		return role_id;
//	}
//
//	public void setRole_id(Integer role_id) {
//		this.role_id = role_id;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}

}
