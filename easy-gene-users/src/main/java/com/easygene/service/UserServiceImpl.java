package com.easygene.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.easygene.entity.UserEntity;
import com.easygene.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Boolean authenticate(String username, String password) {
		Optional<UserEntity> target = userRepo.findById(username);
		if(target.isEmpty()) {
			return false;
		} else {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if(encoder.matches(password, target.get().getUserPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public Boolean registerNewUser(String username, String password) {
		Optional<UserEntity> check = userRepo.findById(username);
		if(check.isPresent()) {
			return false;
		} else {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String encodedPassword = encoder.encode(password);
			UserEntity result = userRepo.save(new UserEntity(username, encodedPassword));
			if(result != null) {
				return true;
			} else {
				return false;
			}
		}
	}

}
