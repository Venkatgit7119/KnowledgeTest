package com.example.demo.model;

import java.util.List;


import com.example.demo.entity.Answers;
import com.example.demo.entity.Questions;





public class QuestionsAndAnswersModel
{
	
	private String topicId;
	
	private String topic;
	
	private List<Questions> questionsList;
	
	private List<Answers> answerList;

	/**
	 * @return the topicId
	 */
	public String getTopicId() {
		return topicId;
	}

	/**
	 * @param topicId the topicId to set
	 */
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the questionsList
	 */
	public List<Questions> getQuestionsList() {
		return questionsList;
	}

	/**
	 * @param questionsList the questionsList to set
	 */
	public void setQuestionsList(List<Questions> questionsList) {
		this.questionsList = questionsList;
	}

	/**
	 * @return the answerList
	 */
	public List<Answers> getAnswerList() {
		return answerList;
	}

	/**
	 * @param answerList the answerList to set
	 */
	public void setAnswerList(List<Answers> answerList) {
		this.answerList = answerList;
	}


}
