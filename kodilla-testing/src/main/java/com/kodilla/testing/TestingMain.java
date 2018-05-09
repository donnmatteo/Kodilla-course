package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
                String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println(("test OK"));
        }else{
            System.out.println("Error");
        }
    }

    Calculator calculator = new Calculator (15, 10);
        int addResult = calculator.add();
        int substractResult = calculator.substract();

        if(addResult > )
}
