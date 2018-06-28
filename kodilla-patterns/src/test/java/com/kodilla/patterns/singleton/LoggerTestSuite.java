package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //Given
        //When
        Logger.getInstance().log("All needed data");
        String logName = Logger.getInstance().getLastLog();
        System.out.println("Log name: " + logName);
        //Then
        Assert.assertEquals("All needed data", logName);
    }

}
