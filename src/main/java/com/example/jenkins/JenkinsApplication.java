package com.example.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("application s...");
	}
	
	
	public static void main(String[] args) {
		logger.info("application executed...");

		SpringApplication.run(JenkinsApplication.class, args);
	}

}
