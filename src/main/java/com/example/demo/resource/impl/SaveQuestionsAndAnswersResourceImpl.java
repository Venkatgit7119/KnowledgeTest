package com.example.demo.resource.impl;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserDetails;
import com.example.demo.model.QuestionsAndAnswersModel;
import com.example.demo.resource.QuestionsAndAnswersResource;
import com.example.demo.resource.QuestionsResource;
import com.example.demo.resource.SaveQuestionsAndAnswersResource;
import com.example.demo.service.QuestionsAndAnswersService;
import com.example.demo.service.SaveQuestionsAndAnswersService;
import com.example.demo.service.UsersService;

@Component
public class SaveQuestionsAndAnswersResourceImpl implements SaveQuestionsAndAnswersResource {
	
	@Autowired
	SaveQuestionsAndAnswersService questionsService;

	@Override
	public String saveQuestionsAndAnswers(String count) {
		
		
		
		return questionsService.saveQuestionsAndAnswers(count);
	}
	


}
