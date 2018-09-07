package com.kodilla.sudoku;

import org.junit.Test;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuTestSuite {
    @Test
    public void SudokuBoardSetElementTest() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();

        //When
        sudokuBoard.setElement(3, 0, 2);
        sudokuBoard.setElement(8, 0, 3);
        sudokuBoard.setElement(1, 1, 7);
        sudokuBoard.setElement(4, 1, 9);
        sudokuBoard.setElement(6, 1, 2);
        sudokuBoard.setElement(1, 2, 6);
        sudokuBoard.setElement(2, 2, 1);
        sudokuBoard.setElement(3, 2, 5);
        sudokuBoard.setElement(4, 2, 8);
        sudokuBoard.setElement(7, 2, 4);
        sudokuBoard.setElement(8, 2, 9);
        sudokuBoard.setElement(0, 3, 8);
        sudokuBoard.setElement(5, 3, 4);
        sudokuBoard.setElement(8, 3, 1);
        sudokuBoard.setElement(0, 5, 7);
        sudokuBoard.setElement(3, 5, 8);
        sudokuBoard.setElement(8, 5, 4);
        sudokuBoard.setElement(0, 6, 5);
        sudokuBoard.setElement(1, 6, 9);
        sudokuBoard.setElement(4, 6, 7);
        sudokuBoard.setElement(5, 6, 8);
        sudokuBoard.setElement(6, 6, 3);
        sudokuBoard.setElement(7, 6, 1);
        sudokuBoard.setElement(2, 7, 4);
        sudokuBoard.setElement(4, 7, 3);
        sudokuBoard.setElement(7, 7, 5);
        sudokuBoard.setElement(0, 8, 6);
        sudokuBoard.setElement(5, 8, 1);

        //Then
        System.out.println(sudokuBoard);
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.resolveSudoku(sudokuBoard);
        System.out.println(sudokuBoard);
    }
}
