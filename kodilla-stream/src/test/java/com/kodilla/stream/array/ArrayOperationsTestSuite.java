package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given

        //When
        int numbers[] = new int[5];
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 3;
        numbers[3] = 2;
        numbers[4] = 1;

        //Then
        Assert.assertEquals(3, ArrayOperations.getAverage(numbers));


    }
}
