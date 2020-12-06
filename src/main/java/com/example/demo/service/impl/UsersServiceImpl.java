package com.example.demo.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UsersService;


@Component
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public String getUsers(String name)
	{
		String comments = "Service up and Running in server. Dont worry"; 
		UserDetails user= userRepo.getuser(name);
		
		if(user!=null && user.getIsActive()!=null && user.getIsActive())
		{
			
				return "1";
			
			
		}

		
		return  "0";
	}

	@Override
	public List<UserDetails> getAllUsers() {
		
		
		String comments = "Service up and Running in server. Dont worry"; 
		List<UserDetails> usersize= new ArrayList<>();
		
		return usersize;
	}

}
