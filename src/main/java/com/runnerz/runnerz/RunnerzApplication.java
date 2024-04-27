package com.runnerz.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);
	

	public static void main(String[] args) {
		log.info("Hello this is abubakar mulla, started learning spring boot 3");
		
		SpringApplication.run(RunnerzApplication.class, args);
	}

}
