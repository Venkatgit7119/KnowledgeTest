package com.example.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserRepository;
import com.example.demo.resource.UsersResource;
import com.example.demo.service.UsersService;


@Component
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public String getUsers(String name)
	{
		String comments = "Service up and Running in server. Dont worry"; 
		List<UserDetails> usersize= userRepo.getusers(name);
		
		if(usersize.size() > 0)
		{
			comments= usersize.get(0).getComments();
		}

		
		return comments;
	}

}
