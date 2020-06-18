package com.nick.af.adapter.web;

import com.nick.af.domain.Feature;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeatureView {
    private final String id;          // P5
    private final String name;        // $1 Feature
    private final String description; // This feature is easy to build
    private final String dollarValue;

    public static FeatureView from(Feature feature) {
        String dollarValue = "$" + feature.dollarValue();
        return new FeatureView(feature.id(), feature.name(), feature.description(), dollarValue);
    }
}
