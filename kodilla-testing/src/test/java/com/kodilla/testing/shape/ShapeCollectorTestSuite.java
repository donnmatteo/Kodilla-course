package com.kodilla.testing.shape;

import org.junit.*;
import static org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("The beginning of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("The end of tests");
    }
    @Before
    public void beforeEveryTest(){
         testCounter ++;
        System.out.println("Executing test #" + testCounter);
        }
}
