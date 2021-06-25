package com.easygene.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.easygene.dto.UserDTO;
import com.easygene.service.UserService;

@RestController
public class UserLoginController {
	@Autowired
	UserService userService;
	
	@CrossOrigin
	@PostMapping(path = "/authenticate")
	public ResponseEntity<Boolean> authenticate(@RequestBody UserDTO input) {
		Boolean res = userService.authenticate(input.getUsername(), input.getUserPassword());
		return new ResponseEntity<Boolean>(res, HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping(path = "/register")
	public ResponseEntity<Boolean> registerNewUser(@RequestBody UserDTO input) {
		Boolean res = userService.registerNewUser(input.getUsername(), input.getUserPassword());
		return new ResponseEntity<Boolean>(res, HttpStatus.OK);
	}
}
