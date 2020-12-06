package com.example.demo.service.impl;


import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Answers;
import com.example.demo.entity.Questions;
import com.example.demo.entity.Topics;
import com.example.demo.entity.UserDetails;
import com.example.demo.model.QuestionsAndAnswersModel;
import com.example.demo.repository.AnswersRepository;
import com.example.demo.repository.QuestionsRepository;
import com.example.demo.repository.TopicsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.QuestionsAndAnswersService;
import com.example.demo.service.UsersService;


@Component
public class QuestionsAndAnswersServiceImpl implements QuestionsAndAnswersService {
	
	@Autowired
	QuestionsRepository questionsrepo;
	
	@Autowired
	AnswersRepository answersrepo;
	
	@Autowired
	TopicsRepository topicsrepo;
	
	@Override
	public QuestionsAndAnswersModel getQuestionsAndAnswersByTopic(String topic)
	{
		String comments = "Service up and Running in server. Dont worry"; 
		
		List<Topics> topicsList=topicsrepo.findAll();
		
		Topics topics=new Topics();
		if(topic.equalsIgnoreCase("0")) 
		{
			 topics=topicsList.get(0);
		}
		else
		{
			Random rand = new Random(); 
			 topics=topicsList.get(rand.nextInt(topicsList.size()));
		}
		
				

		QuestionsAndAnswersModel questionsAndAnswersModel=new QuestionsAndAnswersModel();
		
		List<Questions> questionsList = questionsrepo.findByTopicsid(topics.getId());
		
		List<Answers> answersList = answersrepo.findByTopicsid(topics.getId());
		
		Collections.shuffle(answersList);
		
		//Topics topics=topicsrepo.findAllById(new BigInteger(topic));
		
		questionsAndAnswersModel.setTopicId(topics.getId().toString());
		questionsAndAnswersModel.setTopic(topics.getTopics());
		questionsAndAnswersModel.setQuestionsList(questionsList);
		questionsAndAnswersModel.setAnswerList(answersList);
		

		
		
		return questionsAndAnswersModel;
	}

	
}
