package com.nick.af.game.application;

import com.nick.af.game.application.port.in.NewGameResponse;
import com.nick.af.game.application.port.in.NewGameUseCase;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameServiceTest {
    private final NewGameUseCase newGameUseCase = new GameService();

    @Test
    public void newGame_hasAnId() {
        NewGameResponse newGameResponse = newGameUseCase.newGame();

        assertThat(newGameResponse.getGameId()).isNotNull();
    }

    @Test
    public void newGame_hasFeatureCardNames() {
        NewGameResponse newGameResponse = newGameUseCase.newGame();

        assertThat(newGameResponse.getFeatureCardNames()).isNotEmpty();
    }

    @Test
    public void newGame_hasPracticeCardNames() {
        NewGameResponse newGameResponse = newGameUseCase.newGame();

        assertThat(newGameResponse.getPracticeCardNames()).isNotEmpty();
    }
}
