package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(3, 3);
        double substract = calculator.sub(3, 3);
        double multiply = calculator.mul(3, 3);
        double divide = calculator.div(3, 3);
        //Then
        Assert.assertEquals(6, add, 0.001);
        Assert.assertEquals(0, substract, 0.001);
        Assert.assertEquals(9, multiply, 0.001);
        Assert.assertEquals(1, divide, 0.001);
    }
}
