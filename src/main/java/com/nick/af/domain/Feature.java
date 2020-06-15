package com.nick.af.domain;

public class Feature {
    private final String id;          // P5
    private final String name;        // $1 Feature
    private final String description; // This feature is easy to build
    private int requiredProgrammerEffort;   // 3, -1 If pairing, +1 if Done Done
    private int requiredTesterEffort;    // 2
    private int requiredManagerEffort;  // 1
    private int maintenanceEffort; // 1
    private int dollarValue; // 1

    public Feature(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
