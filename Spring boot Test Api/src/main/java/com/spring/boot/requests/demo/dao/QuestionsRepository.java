package com.spring.boot.requests.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.requests.demo.model.Questions;

public interface QuestionsRepository extends JpaRepository<Questions,Integer>{

}
