package com.example.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    public static final Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("its a test class");
        Assertions.assertEquals(true, true);
    }

}
