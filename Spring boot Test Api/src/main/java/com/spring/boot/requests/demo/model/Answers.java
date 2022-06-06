package com.spring.boot.requests.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="questions")
public class Answers {
	@Id
    @GeneratedValue
    private int qid;   
    private String answer;
	public int getQid() {
		return qid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answers [qid=" + qid + ", answer=" + answer + "]";
	}
    
    
	

}
