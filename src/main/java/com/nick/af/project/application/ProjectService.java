package com.nick.af.project.application;

import com.nick.af.project.application.port.in.NewProjectResponse;
import com.nick.af.project.application.port.in.NewProjectUseCase;
import com.nick.af.project.domain.Project;

import java.util.Collections;

public class ProjectService implements NewProjectUseCase {
    @Override
    public NewProjectResponse newProject() {
        return new NewProjectResponse(
                new Project.Id(42L),
                Collections.singleton("featureCard"),
                Collections.singleton("practiceCard")
        );
    }
}
