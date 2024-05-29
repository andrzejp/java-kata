package org.kata;

import java.util.Set;

import static org.kata.Player.X;
import static org.kata.Square.TOP_LEFT;

public class TicTacToe {

    public Player currentPlayer() {
        return X;
    }

    public Set<Square> takenSquares() {
        return Set.of(TOP_LEFT);
    }

    public void play(Square square) {

    }
}