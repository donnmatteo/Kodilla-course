package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] arg) {
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();
        SudokuBoard theBoard = new SudokuBoard();
        while (!gameFinished) {
            System.out.println(theBoard);
            UserAction action = SudokuUserDialogs.getUserAction();
            if(action.getUserSelect() == UserSelect.QUIT) {
                gameFinished = true;
            } else if(action.getUserSelect() == UserSelect.EXAMPLE) {
                fillExampleData(theBoard);
            } else if(action.getUserSelect() == UserSelect.RESOLVE) {
                theGame.resolveSudoku(theBoard);
                System.out.println(theBoard);
                gameFinished = true;
            } else {
                theBoard.setElement(action.getCol(), action.getRow(), action.getValue());
            }
            //gameFinished = theGame.resolveSudoku();
        }
    }

    private static void fillExampleData(SudokuBoard sudokuBoard) {

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
    }
}
