package com.easygene.dto;

import com.easygene.entity.UserEntity;

public class UserDTO {
	private String username;
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
	
	public UserDTO(String username, String userPassword) {
		super();
		this.username = username;
		this.userPassword = userPassword;
	}
	public static UserDTO valueOf(UserEntity input) {
		return new UserDTO(input.getUsername(), input.getUserPassword());
	}
	
	public UserEntity getEntity() {
		return new UserEntity(username, userPassword);
	}
}
