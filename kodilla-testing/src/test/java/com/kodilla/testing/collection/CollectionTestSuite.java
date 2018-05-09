package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Random;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: Begin");
    }
    @After
    public void after(){
        System.out.println("Test case: End");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite: Begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite: End");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        Random theGenerator = new Random();
        for(int n = 0; n < 20; n++){
            testList.add(theGenerator.nextInt(50));
        //When

        }
    }
}
