package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = applicationContext.getBean(Board.class);

        board.getToDoList().getTasks().add("You have task to do");
        board.getToDoList().getTasks().add("Your task is in progress");
        board.getToDoList().getTasks().add("Your task is done");

        String stringOne = board.getToDoList().getTasks().get(0);
        String stringTwo = board.getInProgressList().getTasks().get(0);
        String stringThree = board.getDoneList().getTasks().get(0);

        Assertions.assertEquals("You have task to do", stringOne);
        Assertions.assertEquals("Your task is in progress", stringTwo);
        Assertions.assertEquals("Your task is done", stringThree);
    }
}
