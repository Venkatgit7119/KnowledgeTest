package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserDetails;

public interface UsersService {

	public String getUsers (String name);

	public List<UserDetails>  getAllUsers();

}

