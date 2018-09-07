package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuGame {
    private SudokuBoard board;
    public boolean resolveSudoku(SudokuBoard board) {
        this.board = board;
        boolean wasChange = true;
        while(wasChange) {
            removeDuplicates();
            wasChange = fillResolvedData();
        }
        return true;
    }

    private boolean fillResolvedData() {
        boolean result = false;
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if(board.getPossibleNumbers(col, row).size() == 1 && board.getElement(col, row) == EMPTY) {
                    board.setElement(col, row, board.getPossibleNumbers(col, row).get(0));
                    result = true;
                }
            }
        }
        return result;
    }

    private void removeDuplicates() {
        for (int row = 0; row < 9; row ++) {
            for (int col = 0; col < 9; col ++) {
                if (board.getElement(col, row ) == EMPTY) {
                    removeDuplicatesFromRow(col, row);
                    removeDuplicatesFromCol(col, row);
                    removeDuplicatesFromBox(col, row);
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

    private void removeDuplicatesFromBox(int col, int row) {
        int boxCol = col/3;
        int boxRow = row/3;
        for (int tempCol = 0; tempCol < 3; tempCol++) {
            for (int tempRow = 0; tempRow < 3; tempRow++) {
                board.getPossibleNumbers(col,row).remove(board.getElement(boxCol * 3 + tempCol, boxRow * 3 + tempRow));
            }
        }
    }
}
