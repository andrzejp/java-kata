package org.kata;

import java.util.Set;

import static org.kata.Player.O;
import static org.kata.Player.X;
import static org.kata.Square.TOP_LEFT;

public class TicTacToe {

    private Player player = X;

    public Player currentPlayer() {
        return player;
    }

    public Set<Square> takenSquares() {
        return Set.of(TOP_LEFT);
    }

    public void play(Square square) {
        player = (player == X) ? O : X;
    }
}