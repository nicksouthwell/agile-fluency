package com.nick.af.project.application;

import com.nick.af.project.application.port.in.NewProjectResponse;
import com.nick.af.project.application.port.out.LoadFeatureCardsPort;
import com.nick.af.project.application.port.out.LoadPracticeCardsPort;
import com.nick.af.project.application.port.out.RawFeatureCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProjectServiceTest {
    private ProjectService projectService;

    @Mock
    LoadFeatureCardsPort featureCardsPort;

    @Mock
    LoadPracticeCardsPort practiceCardsPort;

    @BeforeEach
    public void setUp() {
        projectService = new ProjectService(featureCardsPort, practiceCardsPort);
    }

    @Test
    public void newGame_hasAnId() {
        expectRawFeatureCards();

        NewProjectResponse newProjectResponse = projectService.newProject();

        assertThat(newProjectResponse.projectId()).isNotNull();
    }

    // new games have different ids

    @Test
    public void newGame_hasFeatureCardNames() {
        RawFeatureCard card = new RawFeatureCard("P4", "This feature is easy to build.", 1, 1);
        expectRawFeatureCards(card);

        NewProjectResponse newProject = projectService.newProject();

        Map<String,String> featureCards = newProject.featureCardNames();
        assertThat(featureCards).containsEntry("P4", "$1 Feature");
    }

    @Test
    public void newGame_hasPracticeCardNames() {
        NewProjectResponse project = projectService.newProject();

        assertThat(project.practiceCardNames()).isNotEmpty();
    }

    private void expectRawFeatureCards(RawFeatureCard... cards) {
        List<RawFeatureCard> rawFeatureCards = List.of(cards);
        when(featureCardsPort.loadFeatureCards()).thenReturn(rawFeatureCards);
    }
}
