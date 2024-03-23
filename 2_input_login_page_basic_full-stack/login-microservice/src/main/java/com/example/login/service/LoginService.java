package com.example.login.service;

import org.springframework.stereotype.Service;

import com.example.login.dto.User;

@Service
public class LoginService {
	
	public String checkAuthentication(User user) {
		
		return "Welcome " + user.getUserName() + " your authentication is successful !!!!!";
	}
}
