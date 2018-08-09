package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuBoard {
    private List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for(int n = 0; n < 9; n++) {
            rows.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public Integer getElement(int col, int row) {
        return rows.get(row).getColumns().get(col).getValue();
    }

    public void setElement(int col, int row, Integer value) {
        rows.get(row).getColumns().get(col).setValue(value);
    }

    public List<Integer> getPossibleNumbers(int col, int row) {
        return rows.get(row).getColumns().get(col).getPossibleNumbers();
    }

    @Override
    public String toString() {
        String s = "-------------------------------------------------------\n";
        for (int row = 0; row <9; row++) {
            //s += "|     |     |     |     |     |     |     |     |     |\n";
            s += "|";
            for(int col = 0; col < 9; col++) {
                s += "  ";
                if(getElement(col, row) != EMPTY) {
                    s += getElement(col,row);
                } else {
                    s += " ";
                }
                s += "  |";
            }
            //s += "\n|     |     |     |     |     |     |     |     |     |\n";
            if(row < 8) {
                s += "\n|-----------------------------------------------------|\n";
            }
        }
        s += "\n-------------------------------------------------------\n";
        return s;
    }
}
