package org.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicTacToeTest {

    @Test
    void first_player_is_X() {
        TicTacToe ticTacToe = new TicTacToe();

        String currentPlayer = ticTacToe.currentPlayer();

        assertThat(currentPlayer)
            .isEqualTo("X");
    }

    @Test
    void current_player_can_play_on_a_square() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.play(Square.TOP_LEFT);

        var contents = ticTacToe.square(Square.TOP_LEFT);
        assertThat(contents)
            .isEqualTo("X");
    }
}
