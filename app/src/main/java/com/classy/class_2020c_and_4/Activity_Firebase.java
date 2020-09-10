package com.classy.class_2020c_and_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Activity_Firebase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("exercises/");



        Exercise ex = DataBuilder.buildSingleDemoExercise();

        // with self key
        myRef.child(ex.getKey()).setValue(ex);

        // with auto key
        myRef.push().setValue(ex);


        DatabaseReference imagesRef = database.getReference("images/");




        myRef.child("-MGsdpcUKjjGQXwG9jKZ").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Exercise ex = dataSnapshot.getValue(Exercise.class);
                Log.d("pttt", "Value is: " + ex);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("pttt", "Failed to read value.", error.toException());
            }
        });
    }
}