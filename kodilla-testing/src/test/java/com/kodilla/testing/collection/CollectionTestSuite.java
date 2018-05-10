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
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> theList = new ArrayList<>();
        //When
        numbers.add(null);
        //Then
        Assert.assertTrue(theList.size() == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> theList = new ArrayList<>();
        //When
        Random theGenerator = new Random();
        for(int n = 0; n < 20; n++){
            numbers.add(theGenerator.nextInt(50));
        }
        int checkNumber;
        checkNumber = theList.get();
        //Then
        Assert.assertTrue()
        }
    }
}
