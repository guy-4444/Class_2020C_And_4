package com.classy.class_2020c_and_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class Exercise {

    private String key = "";
    private String name = "";
    private boolean aerobic = false;
    private int reps = 8;
    private int breakTime = 30;
    private ArrayList<String> muscles = new ArrayList<>();
    private Summary summary = new Summary();

    public Exercise() {
        this.key = UUID.randomUUID().toString();
    }

    public Exercise(String name, boolean aerobic, int reps, int breakTime) {
        this.key = UUID.randomUUID().toString();
        this.name = name;
        this.aerobic = aerobic;
        this.reps = reps;
        this.breakTime = breakTime;
    }

    public String getKey() {
        return key;
    }

    public Exercise setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public Exercise setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isAerobic() {
        return aerobic;
    }

    public Exercise setAerobic(boolean aerobic) {
        this.aerobic = aerobic;
        return this;
    }

    public int getReps() {
        return reps;
    }

    public Exercise setReps(int reps) {
        this.reps = reps;
        return this;
    }

    public int getBreakTime() {
        return breakTime;
    }

    public Exercise setBreakTime(int breakTime) {
        this.breakTime = breakTime;
        return this;
    }

    public ArrayList<String> getMuscles() {
        return muscles;
    }

    public Exercise setMuscles(ArrayList<String> muscles) {
        this.muscles = muscles;
        return this;
    }

    public Summary getSummary() {
        return summary;
    }

    public Exercise setSummary(Summary summary) {
        this.summary = summary;
        return this;
    }
}
