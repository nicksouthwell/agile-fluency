package com.nick.af.project.application;

import com.nick.af.project.application.port.in.NewProjectResponse;
import com.nick.af.project.application.port.in.NewProjectUseCase;
import com.nick.af.project.application.port.out.LoadFeatureCardsPort;
import com.nick.af.project.application.port.out.LoadPracticeCardsPort;
import com.nick.af.project.application.port.out.RawFeatureCard;
import com.nick.af.project.domain.Feature;
import com.nick.af.project.domain.Project;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ProjectService implements NewProjectUseCase {
    private final LoadFeatureCardsPort loadFeatureCardsPort;
    private final LoadPracticeCardsPort loadPracticeCardsPort;

    @Override
    public NewProjectResponse newProject() {
        List<Feature> features = loadFeatureCardsPort.loadFeatureCards().stream()
                .map(RawFeatureCard::toFeature)
                .collect(Collectors.toList());

        Project project = new Project(features);

        return new NewProjectResponse(
                new Project.Id(42L),
                project.featureCardNamesById(),
                Collections.singleton("practiceCard")
        );
    }
}
