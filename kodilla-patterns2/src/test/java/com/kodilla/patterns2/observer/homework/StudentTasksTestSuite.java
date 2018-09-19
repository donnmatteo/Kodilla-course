package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTasksTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTasks task1 = new StudentTasks("Divide");
        StudentTasks task2 = new StudentTasks("Substract");
        StudentTasks task3 = new StudentTasks("Add");
        Mentor ObiWanKenobi = new Mentor("Obi-Wan Kenobi");
        Mentor Yoda = new Mentor("Yoda");
        task1.registerObserver(ObiWanKenobi);
        task2.registerObserver(Yoda);
        task3.registerObserver(Yoda);
        //When
        task1.addTask("45 / 7");
        task2.addTask("39 - 8");
        task3.addTask("57 + 9");
        //Then
        assertEquals(1, ObiWanKenobi.getUpdateCount());
        assertEquals(2, Yoda.getUpdateCount());
    }
}
