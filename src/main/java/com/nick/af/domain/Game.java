package com.nick.af.domain;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Game {

    private Set<Feature> availableFeatures = ImmutableSet.<Feature>builder()
            .add(new Feature("P5", "1$ Feature", "This feature is easy to build"))
            .build();

    public int score() {
        return 0;
    }

    public Set<Feature> availableFeatures() {
        return availableFeatures;
    }
}
