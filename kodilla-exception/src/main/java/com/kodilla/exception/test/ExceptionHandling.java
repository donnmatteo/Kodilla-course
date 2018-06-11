package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge run = new SecondChallenge();

        try{
            run.probablyIWillThrowException(2, 1.5);

        } catch(Exception e){
            System.out.println("Exception found: " + e);

        } finally{
            System.out.println("Did it work?");
        }
    }
}
