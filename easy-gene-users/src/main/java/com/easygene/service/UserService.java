package com.easygene.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easygene.dto.UserDTO;
import com.easygene.entity.UserEntity;
import com.easygene.repository.UserRepository;

@Service
public interface UserService {
	public Boolean authenticate(String username, String password);
	public Boolean registerNewUser(String username, String password);
}
