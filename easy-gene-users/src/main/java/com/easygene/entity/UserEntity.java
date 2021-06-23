package com.easygene.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "user_password")
	private String userPassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserEntity(String username, String userPassword) {
		super();
		this.username = username;
		this.userPassword = userPassword;
	}

	public UserEntity() {
		super();
		this.username = "default";
		this.userPassword = "";
	}
	
	
}
