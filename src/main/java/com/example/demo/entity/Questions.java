package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="questions")
public class Questions implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
	
	@Column(name="topicsid")
	private BigInteger topicsid;
	
	@Column(name="questions")
	private String questions;

	@Column(name="questionstamil")
	private String questionstamil;
	
	@Column(name="correctAnswers")
	private String correctAnswers;

	
	@Column(name="correctAnswersTamil")
	private String correctAnswersTamil;


	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}

	/**
	 * @return the topicsid
	 */
	public BigInteger getTopicsid() {
		return topicsid;
	}

	/**
	 * @param topicsid the topicsid to set
	 */
	public void setTopicsid(BigInteger topicsid) {
		this.topicsid = topicsid;
	}

	/**
	 * @return the questions
	 */
	public String getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(String questions) {
		this.questions = questions;
	}

	/**
	 * @return the questionstamil
	 */
	public String getQuestionstamil() {
		return questionstamil;
	}

	/**
	 * @param questionstamil the questionstamil to set
	 */
	public void setQuestionstamil(String questionstamil) {
		this.questionstamil = questionstamil;
	}

	/**
	 * @return the correctAnswers
	 */
	public String getCorrectAnswers() {
		return correctAnswers;
	}

	/**
	 * @param correctAnswers the correctAnswers to set
	 */
	public void setCorrectAnswers(String correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	/**
	 * @return the correctAnswersTamil
	 */
	public String getCorrectAnswersTamil() {
		return correctAnswersTamil;
	}

	/**
	 * @param correctAnswersTamil the correctAnswersTamil to set
	 */
	public void setCorrectAnswersTamil(String correctAnswersTamil) {
		this.correctAnswersTamil = correctAnswersTamil;
	}
	



}
