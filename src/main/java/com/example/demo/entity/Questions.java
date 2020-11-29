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
	



}
