package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="topics")
public class Topics implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private BigInteger id;
		
	
	@Column(name="topics")
	private String topics;

	@Column(name="topicstamil")
	private String topicstamil;

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
	 * @return the topics
	 */
	public String getTopics() {
		return topics;
	}

	/**
	 * @param topics the topics to set
	 */
	public void setTopics(String topics) {
		this.topics = topics;
	}

	/**
	 * @return the topicstamil
	 */
	public String getTopicstamil() {
		return topicstamil;
	}

	/**
	 * @param topicstamil the topicstamil to set
	 */
	public void setTopicstamil(String topicstamil) {
		this.topicstamil = topicstamil;
	}

	


}
