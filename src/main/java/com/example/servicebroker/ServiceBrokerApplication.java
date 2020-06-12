package com.example.servicebroker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceBrokerApplication {
	
	 private static final Logger logger = LogManager.getLogger(ServiceBrokerApplication.class);

	public static void main(String[] args) {
		logger.info("INFO: Hello app broker...........................");
		logger.debug("DEBUG: Hello app broker...........................");
		logger.error("ERROR: Hello app broker...........................");
		 System.out.println("**************************inside ServiceBrokerApplication*****************************8");
	       
		SpringApplication.run(ServiceBrokerApplication.class, args);
	}

	
}
