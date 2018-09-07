package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuUserDialogs {

    public static UserAction getUserAction() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter item (CRV - Column, Row, Value) or (E)xample or (R)esolve or (Q)uit");
            String s = scanner.nextLine().toUpperCase();
            if(s.equals("Q")) {
                return new UserAction(UserSelect.QUIT);
            } else if(s.equals("R")) {
                return new UserAction(UserSelect.RESOLVE);
            } else if(s.equals("E")) {
                return new UserAction(UserSelect.EXAMPLE);
            } else {
                try {
                    int col = Integer.parseInt(s.substring(0, 1));
                    int row = Integer.parseInt(s.substring(1, 2));
                    int val = Integer.parseInt(s.substring(2, 3));
                    if(s.length() != 3 || col == 0 || row == 0 || val == 0) {
                        throw new Exception();
                    }
                    return new UserAction(UserSelect.NEW_ITEM, col - 1, row - 1, val);
                } catch (Exception e) {
                    System.out.println("Wrong data!");
                }

            }
        }
    }
}
