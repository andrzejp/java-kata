package org.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicTacToeTest {

    @Test
    void first_player_is_X() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.start();
        ticTacToe.currentPlayer();
    }
}
