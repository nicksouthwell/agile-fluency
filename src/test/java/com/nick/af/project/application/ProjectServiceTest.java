package com.nick.af.project.application;

import com.nick.af.project.application.port.in.NewProjectResponse;
import com.nick.af.project.application.port.in.NewProjectUseCase;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectServiceTest {
    private final NewProjectUseCase newProjectUseCase = new ProjectService();

    @Test
    public void newGame_hasAnId() {
        NewProjectResponse newProjectResponse = newProjectUseCase.newProject();

        assertThat(newProjectResponse.projectId()).isNotNull();
    }

    @Test
    public void newGame_hasFeatureCardNames() {
        NewProjectResponse project = newProjectUseCase.newProject();

        Collection<String> featureCardNames = project.featureCardNames();
        assertThat(featureCardNames).isNotEmpty();
    }

    @Test
    public void newGame_hasPracticeCardNames() {
        NewProjectResponse newProjectResponse = newProjectUseCase.newProject();

        assertThat(newProjectResponse.practiceCardNames()).isNotEmpty();
    }
}
