package com.classy.class_2020c_and_4;

public class Summary {

    private int duration = 0;
    private int actualReps = 0;

    public Summary() { }

    public Summary(int duration, int actualReps) {
        this.duration = duration;
        this.actualReps = actualReps;
    }

    public int getDuration() {
        return duration;
    }

    public Summary setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public int getActualReps() {
        return actualReps;
    }

    public Summary setActualReps(int actualReps) {
        this.actualReps = actualReps;
        return this;
    }
}
