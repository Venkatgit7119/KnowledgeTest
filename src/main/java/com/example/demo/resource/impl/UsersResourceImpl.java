package com.example.demo.resource.impl;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserDetails;
import com.example.demo.resource.UsersResource;
import com.example.demo.service.UsersService;


@Component
public class UsersResourceImpl implements UsersResource {
	
	@Autowired
	UsersService userService;
	

	@Override
	public String getUsersById(String name) {
		return  userService.getUsers(name);
	}


	@Override
	public List<UserDetails> getAllUsers() {
		
		//Response response = Response.ok(userService.getAllUsers());
		
		return  userService.getAllUsers();
	}

}
