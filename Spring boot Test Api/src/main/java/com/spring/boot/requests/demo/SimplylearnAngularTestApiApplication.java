package com.spring.boot.requests.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.requests.demo.dao.AnswerRepository;
import com.spring.boot.requests.demo.dao.QuestionsRepository;
import com.spring.boot.requests.demo.model.Answers;
import com.spring.boot.requests.demo.model.Questions;

@RestController
@CrossOrigin(origins = "*")
@SpringBootApplication
public class SimplylearnAngularTestApiApplication {	
	
	 @Autowired
	    private QuestionsRepository repository;
	 @Autowired
	 private AnswerRepository repository2;
	 
	 @GetMapping("/getAllQuestions")
	    public List<Questions> findAllQuestions() {
	        return repository.findAll();
	       
	    }
	 
	 
	 @GetMapping("/getAllAnswers")
	    public List<Answers> findAllAnswers() {
	        return repository2.findAll();
	        
	       
	    }
	 
	 
	  

	public static void main(String[] args) {
		SpringApplication.run(SimplylearnAngularTestApiApplication.class, args);
	}

}
