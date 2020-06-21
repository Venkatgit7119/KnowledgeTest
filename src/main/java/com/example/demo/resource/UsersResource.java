package com.example.demo.resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UsersResource {

    
    @RequestMapping(value="/getUsers")
  	public String getUsersById (@RequestParam(value = "name", defaultValue = "Venkat") String name);
}

