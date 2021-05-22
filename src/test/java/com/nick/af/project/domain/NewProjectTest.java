package com.nick.af.project.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NewProjectTest {
    private Project project = new Project();

    @Test
    public void aNewGameHasAScoreOfZero() {
        assertThat(project.score())
                .isZero();
    }

    @Test
    public void aNewGameHasAvailableFeatures() {
        assertThat(project.availableFeatures()).isNotEmpty();
    }
}