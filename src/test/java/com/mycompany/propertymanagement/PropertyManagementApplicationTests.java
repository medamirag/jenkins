package com.mycompany.propertymanagement;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyManagementApplicationTests {
	Logger logger = LoggerFactory.getLogger(PropertyManagementApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("one test is here");
	}

}
