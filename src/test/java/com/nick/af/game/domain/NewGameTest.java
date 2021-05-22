package com.nick.af.game.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewGameTest {
    private Game game = new Game();

    @Test
    public void aNewGameHasAScoreOfZero() {
        assertThat(game.score())
                .isZero();
    }

    @Test
    public void aNewGameHasAvailableFeatures() {
        assertThat(game.availableFeatures()).isNotEmpty();
    }
}