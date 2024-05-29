package org.kata;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.kata.Square.TOP_LEFT;

class TicTacToeTest {

    @Test
    void first_player_is_X() {
        TicTacToe ticTacToe = new TicTacToe();

        Player currentPlayer = ticTacToe.currentPlayer();
        assertThat(currentPlayer)
                .isEqualTo(Player.X);
    }

    @Test
    void current_player_can_play_on_a_square() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.play(TOP_LEFT);

        Set<Square> squares = ticTacToe.takenSquares();
        assertThat(squares)
                .contains(TOP_LEFT);
    }
}
