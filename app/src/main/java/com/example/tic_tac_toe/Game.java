/**
 * @author Scott Guetens
 * @version 1.0
 */
package com.example.tic_tac_toe;

public class Game{

    protected static String player_1 = "O";
    protected static String player_2 = "X";

    /**
     * @param i indicates player 1's choice
     */
    protected static void startGame(int i) {

        if (i == 0) {
            player_1 = "X";
            player_2 = "O";
        }
    }
}
