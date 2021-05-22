package com.nick.af.game.adapter.in.web;

import com.nick.af.game.domain.Feature;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeatureView {
    private final String id;          // P5
    private final String name;        // $1 Feature
    private final String description; // This feature is easy to build

    public static FeatureView from(Feature feature) {
        String name = String.format("$%d Feature", feature.dollarValue());
        return new FeatureView(feature.id(), name, feature.description());
    }
}
