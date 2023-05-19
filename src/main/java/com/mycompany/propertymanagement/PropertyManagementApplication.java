package com.mycompany.propertymanagement;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertyManagementApplication {
	@PostConstruct
	public void init() {
		logger.info("-***-*-Application a commencé...");
	}
	public static void main(String[] args) {
		logger.info("~~~~Application a demarréee...");

		SpringApplication.run(PropertyManagementApplication.class, args);
	}
	static Logger logger = LoggerFactory.getLogger(PropertyManagementApplication.class);


}
