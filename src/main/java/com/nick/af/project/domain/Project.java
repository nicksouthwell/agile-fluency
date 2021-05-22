package com.nick.af.project.domain;

import com.google.common.collect.ImmutableSet;
import lombok.Value;

import java.util.Set;

public class Project {

    // ctor: initialized with feature & practice cards
    // provides lists of visible cards
    // allows inspection of visible cards
    // create a new project
    // (list/restore saved projects)

    private Set<Feature> availableFeatures = ImmutableSet.<Feature>builder()
            .add(new Feature("P5", "This feature is easy to build", 1))
            .build();

    public int score() {
        return 0;
    }

    public Set<Feature> availableFeatures() {
        return availableFeatures;
    }

    @Value
    public static class Id {
        Long value;
    }
}
