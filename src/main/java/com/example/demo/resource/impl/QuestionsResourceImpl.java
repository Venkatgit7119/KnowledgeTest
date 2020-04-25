package com.example.demo.resource.impl;

import org.springframework.stereotype.Component;

import com.example.demo.resource.QuestionsResource;

@Component
public class QuestionsResourceImpl implements QuestionsResource {

	public String getQuestions ()
	{
		return "in Questions Resource impl";
		
	}

}
