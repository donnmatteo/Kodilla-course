package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value;
    private List<Integer> possibleNumbers = new ArrayList<>();



    public SudokuElement() {
        this.value = EMPTY;
        for(int n = 1; n <=9; n++) {
            possibleNumbers.add(n);
        }
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " " + value;
    }
}
