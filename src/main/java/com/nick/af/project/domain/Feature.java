package com.nick.af.project.domain;

public class Feature {
    private final String id;            // P5
    private final String description;   // This feature is easy to build
    private final int dollarValue;      // 1
    private Requirements requirements;

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
