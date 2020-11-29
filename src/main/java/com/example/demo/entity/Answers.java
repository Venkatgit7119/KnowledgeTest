package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="answers")
public class Answers implements Serializable
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
	
	@Column(name="questionsid")
	private BigInteger questionsid;
	
	
	@Column(name="answers")
	private String answers;

	@Column(name="answerstamil")
	private String answerstamil;

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
	 * @return the questionsid
	 */
	public BigInteger getQuestionsid() {
		return questionsid;
	}

	/**
	 * @param questionsid the questionsid to set
	 */
	public void setQuestionsid(BigInteger questionsid) {
		this.questionsid = questionsid;
	}

	/**
	 * @return the answers
	 */
	public String getAnswers() {
		return answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(String answers) {
		this.answers = answers;
	}

	/**
	 * @return the answerstamil
	 */
	public String getAnswerstamil() {
		return answerstamil;
	}

	/**
	 * @param answerstamil the answerstamil to set
	 */
	public void setAnswerstamil(String answerstamil) {
		this.answerstamil = answerstamil;
	}


	


}
