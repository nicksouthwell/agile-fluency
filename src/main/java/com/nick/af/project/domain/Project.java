package com.nick.af.project.domain;

import lombok.Value;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Project {

    private final Id id;
    private final List<Feature> features;

    public Project(List<Feature> features) {
        this.id = new Id(42L);
        this.features = features;
    }
    // ctor: initialized with feature & practice cards
    // provides lists of visible cards
    // allows inspection of visible cards
    // create a new project
    // (list/restore saved projects)

    public int score() {
        return 0;
    }

    public Map<String, String> featureCardNamesById() {
        return features.stream().collect(toMap(Feature::id, Feature::name));
    }

    @Value
    public static class Id {
        Long value;
    }
}
