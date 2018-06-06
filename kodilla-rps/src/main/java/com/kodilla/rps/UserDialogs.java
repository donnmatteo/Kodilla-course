package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your name: ");
            String result = scanner.nextLine();
            if(result.length() > 0){
                return result;
            }
            System.out.println("Something went wrong");
        }

    }

    public static RpsTypes getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Select (S)cissors, (P)aper or (R)ock");
        }
    }
}
