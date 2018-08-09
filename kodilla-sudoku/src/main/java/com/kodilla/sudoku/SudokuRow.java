package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> columns = new ArrayList<>();

    public SudokuRow() {
        for(int n = 0; n < 9; n++) {
            columns.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        return "|"+ columns + "\n";
    }
}
