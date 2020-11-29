package com.example.demo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Questions;
import com.example.demo.entity.UserDetails;

//@Component
@Repository
//@NoRepositoryBean
//@Transactional
public interface QuestionsRepository extends JpaRepository<Questions,BigInteger> {
	
	List<Questions> findByTopicsid(BigInteger topicsid);

}