package com.classy.class_2020c_and_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_List extends AppCompatActivity {

    private RecyclerView list_LST_exercises;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_LST_exercises = findViewById(R.id.list_LST_exercises);


        ArrayList<Exercise> exercises = DataBuilder.buildData();


        Adapter_Exercise adapter_exercise = new Adapter_Exercise(this, exercises);
        adapter_exercise.setClickListeners(exerciseItemClickListener);
        list_LST_exercises.setLayoutManager(new LinearLayoutManager(this));
        list_LST_exercises.setAdapter(adapter_exercise);
    }

    Adapter_Exercise.ExerciseItemClickListener exerciseItemClickListener = new Adapter_Exercise.ExerciseItemClickListener() {
        @Override
        public void itemClicked(Exercise exercise, int position) {
            Toast.makeText(Activity_List.this, exercise.getName() + " Clicked", Toast.LENGTH_SHORT).show();
        }
    };
}