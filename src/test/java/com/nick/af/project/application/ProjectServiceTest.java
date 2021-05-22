package com.nick.af.project.application;

import com.nick.af.project.application.port.in.NewProjectResponse;
import com.nick.af.project.application.port.in.NewProjectUseCase;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectServiceTest {
    private final NewProjectUseCase newProjectUseCase = new ProjectService();

    @Test
    public void newGame_hasAnId() {
        NewProjectResponse newProjectResponse = newProjectUseCase.newGame();

        assertThat(newProjectResponse.getProjectId()).isNotNull();
    }

    @Test
    public void newGame_hasFeatureCardNames() {
        NewProjectResponse newProjectResponse = newProjectUseCase.newGame();

        assertThat(newProjectResponse.getFeatureCardNames()).isNotEmpty();
    }

    @Test
    public void newGame_hasPracticeCardNames() {
        NewProjectResponse newProjectResponse = newProjectUseCase.newGame();

        assertThat(newProjectResponse.getPracticeCardNames()).isNotEmpty();
    }
}
