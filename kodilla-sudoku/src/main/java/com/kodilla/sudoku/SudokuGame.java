package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuGame {
    private SudokuBoard board;
    public boolean resolveSudoku(SudokuBoard board) {
        this.board = board;
        removeDuplicates();
        fillResolvedData();
        return true;
    }

    private void fillResolvedData() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if(board.getPossibleNumbers(col, row).size() == 1) {
                    board.setElement(col, row, board.getPossibleNumbers(col, row).get(0));
                }
            }
        }
    }

    private void removeDuplicates() {
        for (int row = 0; row < 9; row ++) {
            for (int col = 0; col < 9; col ++) {
                if (board.getElement(col, row ) == EMPTY) {
                    removeDuplicatesFromRow(col, row);
                    removeDuplicatesFromCol(col, row);
                    //remove duplicates from box
                }
            }
        }
    }

    private void removeDuplicatesFromCol(int col, int row) {
        for (int n = 0; n < 9; n++) {
            board.getPossibleNumbers(col, row).remove(board.getElement(col, n));
        }
    }

    private void removeDuplicatesFromRow(int col, int row) {
        for (int n = 0; n < 9; n++) {
            board.getPossibleNumbers(col, row).remove(board.getElement(n, row));
        }
    }
}
