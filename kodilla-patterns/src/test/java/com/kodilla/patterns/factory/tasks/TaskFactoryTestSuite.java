package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeShape(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Birthday shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeShape(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting classes", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeShape(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Turning left", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
