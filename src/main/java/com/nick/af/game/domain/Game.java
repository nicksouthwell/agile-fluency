package com.nick.af.game.domain;

import com.google.common.collect.ImmutableSet;
import lombok.Value;

import java.util.Set;

public class Game {

    // ctor: load feature & practice cards
    // provide lists of visible cards
    // allow inspection of visible cards
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
