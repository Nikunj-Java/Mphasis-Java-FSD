package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/send")
	public String sendMessage() {
		
		kafkaTemplate.send("GENERAL","Hello From My Apache Kafka");
		
		return "Please Check Console";
	}

}
