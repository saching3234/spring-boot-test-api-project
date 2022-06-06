package com.spring.boot.requests.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.requests.demo.model.Answers;

public interface AnswerRepository extends JpaRepository<Answers,Integer> {

}
