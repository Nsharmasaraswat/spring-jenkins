package com.javatechie.consul.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReddis1Application {
	

	static Logger logger = LoggerFactory.getLogger(SpringReddis1Application.class);

	@PostConstruct
	public void init()
	{
		logger.info("application started");
	}
	
	public static void main(String[] args) {
		
		
		
		logger.info("application executed...");

		logger.info("new  logger added");
		
		SpringApplication.run(SpringReddis1Application.class, args);
	}

}
