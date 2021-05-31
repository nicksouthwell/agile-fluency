package com.nick.af.project.application.port.in;

import com.nick.af.project.domain.Project;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.Map;

@Value
@Accessors(fluent = true)
public class NewProjectResponse {
    Project.Id projectId;
    Map<String,String> featureCardNames;
    Collection<String> practiceCardNames;
}
