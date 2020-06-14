package com.nick.af.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewGameTest {
    @Test
    public void aNewGameHasAScoreOfZero() {
        Game game = new Game();

        assertThat(game.score())
                .isZero();
    }
}