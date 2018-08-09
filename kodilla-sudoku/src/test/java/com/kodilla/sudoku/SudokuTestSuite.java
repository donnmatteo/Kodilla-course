package com.kodilla.sudoku;

import org.junit.Test;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuTestSuite {
    @Test
    public void SudokuBoardSetElementTest() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();

        //When
        sudokuBoard.setElement(0, 0, EMPTY);
        sudokuBoard.setElement(1, 0, 1);
        sudokuBoard.setElement(2, 0, EMPTY);
        sudokuBoard.setElement(3, 0, 7);
        sudokuBoard.setElement(4, 0, EMPTY);
        sudokuBoard.setElement(5, 0, EMPTY);
        sudokuBoard.setElement(6, 0, 6);
        sudokuBoard.setElement(7, 0, 4);
        sudokuBoard.setElement(8, 0, EMPTY);
        sudokuBoard.setElement(0, 1, EMPTY);
        sudokuBoard.setElement(1, 1, EMPTY);
        sudokuBoard.setElement(2, 1, EMPTY);
        sudokuBoard.setElement(3, 1, 8);
        sudokuBoard.setElement(4, 1, EMPTY);
        sudokuBoard.setElement(5, 1, EMPTY);
        sudokuBoard.setElement(6, 1, EMPTY);
        sudokuBoard.setElement(7, 1, 1);
        sudokuBoard.setElement(8, 1, EMPTY);
        sudokuBoard.setElement(0, 2, EMPTY);
        sudokuBoard.setElement(1, 2, EMPTY);
        sudokuBoard.setElement(2, 2, 7);
        sudokuBoard.setElement(3, 2, EMPTY);
        sudokuBoard.setElement(4, 2, EMPTY);
        sudokuBoard.setElement(5, 2, EMPTY);
        sudokuBoard.setElement(6, 2, EMPTY);
        sudokuBoard.setElement(7, 2, EMPTY);
        sudokuBoard.setElement(8, 2, EMPTY);
        sudokuBoard.setElement(0, 3, EMPTY);
        sudokuBoard.setElement(1, 3, EMPTY);
        sudokuBoard.setElement(2, 3, EMPTY);
        sudokuBoard.setElement(3, 3, EMPTY);
        sudokuBoard.setElement(4, 3, EMPTY);
        sudokuBoard.setElement(5, 3, EMPTY);
        sudokuBoard.setElement(6, 3, 1);
        sudokuBoard.setElement(7, 3, 9);
        sudokuBoard.setElement(8, 3, EMPTY);
        sudokuBoard.setElement(0, 4, 3);
        sudokuBoard.setElement(1, 4, EMPTY);
        sudokuBoard.setElement(2, 4, EMPTY);
        sudokuBoard.setElement(3, 4, EMPTY);
        sudokuBoard.setElement(4, 4, EMPTY);
        sudokuBoard.setElement(5, 4, EMPTY);
        sudokuBoard.setElement(6, 4, EMPTY);
        sudokuBoard.setElement(7, 4, EMPTY);
        sudokuBoard.setElement(8, 4, 2);
        sudokuBoard.setElement(0, 5, EMPTY);
        sudokuBoard.setElement(1, 5, 4);
        sudokuBoard.setElement(2, 5, 1);
        sudokuBoard.setElement(3, 5, EMPTY);
        sudokuBoard.setElement(4, 5, EMPTY);
        sudokuBoard.setElement(5, 5, EMPTY);
        sudokuBoard.setElement(6, 5, EMPTY);
        sudokuBoard.setElement(7, 5, EMPTY);
        sudokuBoard.setElement(8, 5, EMPTY);
        sudokuBoard.setElement(0, 6, EMPTY);
        sudokuBoard.setElement(1, 6, EMPTY);
        sudokuBoard.setElement(2, 6, EMPTY);
        sudokuBoard.setElement(3, 6, EMPTY);
        sudokuBoard.setElement(4, 6, EMPTY);
        sudokuBoard.setElement(5, 6, EMPTY);
        sudokuBoard.setElement(6, 6, 9);
        sudokuBoard.setElement(7, 6, EMPTY);
        sudokuBoard.setElement(8, 6, EMPTY);
        sudokuBoard.setElement(0, 7, EMPTY);
        sudokuBoard.setElement(1, 7, 6);
        sudokuBoard.setElement(2, 7, EMPTY);
        sudokuBoard.setElement(3, 7, EMPTY);
        sudokuBoard.setElement(4, 7, EMPTY);
        sudokuBoard.setElement(5, 7, 2);
        sudokuBoard.setElement(6, 7, EMPTY);
        sudokuBoard.setElement(7, 7, EMPTY);
        sudokuBoard.setElement(8, 7, EMPTY);
        sudokuBoard.setElement(0, 8, EMPTY);
        sudokuBoard.setElement(1, 8, 5);
        sudokuBoard.setElement(2, 8, 9);
        sudokuBoard.setElement(3, 8, EMPTY);
        sudokuBoard.setElement(4, 8, EMPTY);
        sudokuBoard.setElement(5, 8, 4);
        sudokuBoard.setElement(6, 8, EMPTY);
        sudokuBoard.setElement(7, 8, 8);
        sudokuBoard.setElement(8, 8, EMPTY);

        //Then
        System.out.println(sudokuBoard);
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.resolveSudoku(sudokuBoard);
        System.out.println(sudokuBoard);
    }
}
