package com.classy.class_2020c_and_4;

import java.util.ArrayList;

public class DataBuilder {

    public static Exercise buildSingleDemoExercise() {
        Summary summary = new Summary(52, 7);
        Exercise exercise = new Exercise("Bench Press", false, 8, 30)
                .setSummary(summary);
        exercise.getMuscles().add("Chest");
        exercise.getMuscles().add("Shoulder");
        exercise.getMuscles().add("Arm");

        return exercise;
    }

    public static  ArrayList<Exercise> buildData() {
        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(new Exercise("Bench Press", false, 8, 45));
        exercises.add(new Exercise("Arm Curl", false, 10, 45));
        exercises.add(new Exercise("Running", true, 30, 30));
        exercises.add(new Exercise("Cycling", true, 30, 60));
        exercises.add(new Exercise("Squats", false, 56, 45));
        exercises.add(new Exercise("Ski", true, 20, 45));
        exercises.add(new Exercise("Upper Poly", false, 7, 45));
        exercises.add(new Exercise("Dead Lift0", false, 8, 45));
        exercises.add(new Exercise("Dead Lift1", false, 8, 45));
        exercises.add(new Exercise("Dead Lift2", false, 8, 45));
        exercises.add(new Exercise("Dead Lift3", false, 8, 45));
        exercises.add(new Exercise("Dead Lift4", false, 8, 45));
        exercises.add(new Exercise("Dead Lift5", false, 8, 45));
        exercises.add(new Exercise("Dead Lift6", false, 8, 45));
        exercises.add(new Exercise("Dead Lift7", false, 8, 45));
        exercises.add(new Exercise("Dead Lift8", false, 8, 45));
        exercises.add(new Exercise("Dead Lift9", false, 8, 45));
        return exercises;
    }
}
