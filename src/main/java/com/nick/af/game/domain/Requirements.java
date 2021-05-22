package com.nick.af.game.domain;

public class Requirements {
    private Effort programmerEffort;
    private Effort testerEffort;
    private Effort managerEffort;
    private int maintenanceCost;

    public Requirements() {
        this(new Effort(), new Effort(), new Effort(), 0);
    }

    public Requirements(Effort programmerEffort, Effort testerEffort, Effort managerEffort, int maintenanceCost) {
        this.programmerEffort = programmerEffort;
        this.testerEffort = testerEffort;
        this.managerEffort = managerEffort;
        this.maintenanceCost = maintenanceCost;
    }
}
