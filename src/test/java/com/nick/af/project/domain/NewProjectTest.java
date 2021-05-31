package com.nick.af.project.domain;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class NewProjectTest {
    private final Project project = new Project(Collections.emptyList());

    @Test
    public void aNewGameHasAScoreOfZero() {
        assertThat(project.score())
                .isZero();
    }
}