package org.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.kata.Square.TOP_LEFT;
import static org.kata.Square.TOP_MIDDLE;

class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void first_player_is_X() {
        Player currentPlayer = ticTacToe.currentPlayer();
        assertThat(currentPlayer)
                .isEqualTo(Player.X);
    }

    @Test
    void current_player_can_play_on_a_square() {
        ticTacToe.play(TOP_LEFT);

        Set<Square> squares = ticTacToe.takenSquares();
        assertThat(squares)
                .contains(TOP_LEFT);
    }

    @Test
    void second_player_is_O() {
        ticTacToe.play(TOP_LEFT);

        Player currentPlayer = ticTacToe.currentPlayer();
        assertThat(currentPlayer)
            .isEqualTo(Player.O);
    }

    @Test
    void third_player_is_X() {
        ticTacToe.play(TOP_LEFT);
        ticTacToe.play(TOP_MIDDLE);

        Player currentPlayer = ticTacToe.currentPlayer();
        assertThat(currentPlayer)
            .isEqualTo(Player.X);
    }
}
