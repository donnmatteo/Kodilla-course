package com.kodilla.sudoku;

public class UserAction {
    private UserSelect userSelect;

    private int col;
    private int row;
    private int value;

    public UserAction(UserSelect userSelect, int col, int row, int value) {
        this.userSelect = userSelect;
        this.col = col;
        this.row = row;
        this.value = value;
    }

    public UserAction(UserSelect userSelect) {
        this.userSelect = userSelect;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }

    public UserSelect getUserSelect() {
        return userSelect;
    }
}
