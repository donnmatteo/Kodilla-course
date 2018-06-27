package com.kodilla.spring.portfolio;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void boardConfigTest() {
        //Given

        //When
        board.getInProgressList().getTasks().add("Zadanie1");
        board.getDoneList().getTasks().add("Zadanie2");
        board.getToDoList().getTasks().add("Zadanie3");
        //Then
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals(1, board.getToDoList().getTasks().size());

    }
}
