package com.kodilla.spring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = applicationContext.getBean(ForumUser.class);
        String name =  forumUser.getUsername();
        Assertions.assertEquals("John Smith", name);
    }
}
