package com.example.demo.resource;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.QuestionsAndAnswersModel;

@RestController
public interface SaveQuestionsAndAnswersResource {

    
    @RequestMapping(value="/saveQuestionsAndAnswers", method = RequestMethod.GET, produces = { "application/json" })
  	public String saveQuestionsAndAnswers(@RequestParam(value = "count", defaultValue = "2") String count);
    
    
    
}

