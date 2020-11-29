package com.example.demo.resource;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserDetails;

@RestController
public interface UsersResource {

    
    @RequestMapping(value="/getUsers", method = RequestMethod.GET, produces = { "application/json" })
  	public String getUsersById (@RequestParam(value = "name", defaultValue = "Venkat") String name);
    
    
    @RequestMapping(value="/getAllUsers", method = RequestMethod.GET, produces = { "application/json" })
  	public List<UserDetails> getAllUsers();
    
    
}

