package com.example.demo.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.resource.UsersResource;
import com.example.demo.service.UsersService;


@Component
public class UsersResourceImpl implements UsersResource {
	
	@Autowired
	UsersService userService;
	
	@Override
	public String getUsers ()
	{
		
		
		
		return  userService.getUsers();
		
	}

}
