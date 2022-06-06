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

public class Questions {
	
	@Id
    @GeneratedValue
    private int qid;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
   // private String answer;
	
    public int getQid() {
		return qid;
	}
	public String getQuestion() {
		return question;
	}
	public String getOption1() {
		return option1;
	}
	public String getOption2() {
		return option2;
	}
	public String getOption3() {
		return option3;
	}
	public String getOption4() {
		return option4;
	}
//	public String getAnswer() {
//		return answer;
//	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	//public void setAnswer(String answer) {
//		this.answer = answer;
	//}
	
	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 +  "]";
	}	
	

    
    
    
    
    
    
    
    
    
    
    
    
}
