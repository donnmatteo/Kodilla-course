package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer {

    public static RpsTypes getComputerSelection() {
        Random random = new Random();
        int selected = random.nextInt(3);
        switch(selected) {
            case 0: return RpsTypes.PAPER;
            case 1: return RpsTypes.ROCK;
            case 2: return RpsTypes.SCISSORS;
        }
        return null;
    }
}
