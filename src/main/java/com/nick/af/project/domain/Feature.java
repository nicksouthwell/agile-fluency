package com.nick.af.project.domain;

import lombok.Value;

@Value
public class Feature {
    String id;            // P5
    String description;   // This feature is easy to build
    int dollarValue;      // 1
    Requirements requirements;

    public Feature(String id, String description, int dollarValue) {
        this.id = id;
        this.description = description;
        this.dollarValue = dollarValue;
        this.requirements = new Requirements();
    }

    public String id() {
        return id;
    }

    public String description() {
        return description;
    }

    public int dollarValue() {
        return dollarValue;
    }
}
