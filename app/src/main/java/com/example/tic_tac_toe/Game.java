package com.example.tic_tac_toe;

public class Game{

    protected static String player_1;
    protected static String player_2;

    protected static void startGame(int i) {
        if (i == 0) {
            player_1 = "X";
            player_2 = "O";
        }
        else {
            player_1 = "O";
            player_2 = "X";
        }
    }
}
