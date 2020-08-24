package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class JenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("test case executed...");
		assertEquals(true, true);
	}

}
