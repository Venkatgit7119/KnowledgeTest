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
	public String getUsers()
	{
		List<UserDetails> usersize= userRepo.getusers("Venkat");
		
		
		
		return "in Users service impl Hello" +usersize.get(0).getName() ;
	}

}
