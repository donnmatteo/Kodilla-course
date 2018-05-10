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
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = test.exterminate(numbers);
        //Then
        Assert.assertEquals(0, resultList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = test.exterminate(numbers);
        //Then
        for(int n = 0; n < resultList.size(); n ++){
            Assert.assertEquals(0, resultList.get(n) % 2);
        }
        Assert.assertEquals(2, resultList.size());
    }
}
