package com.classy.class_2020c_and_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Exercise extends RecyclerView.Adapter<Adapter_Exercise.ViewHolder> {

    private ArrayList<Exercise> mData = new ArrayList<>();
    private LayoutInflater mInflater;
    private Context context;
    private ExerciseItemClickListener exerciseItemClickListener;

    // data is passed into the constructor
    Adapter_Exercise(Context context, ArrayList<Exercise> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
    }

    public void setClickListeners(ExerciseItemClickListener exerciseItemClickListener) {
        this.exerciseItemClickListener = exerciseItemClickListener;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_item_exercise, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("pttt", "position = " + position);
        Exercise exercise = mData.get(position);

        String link = "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png";


        if (position > 10) {
            Glide
                    .with(context)
                    .load(link)
                    .centerCrop()
                    .into(holder.exercise_IMG_icon);
        }

        holder.exercise_LBL_key.setText("" + position);
        holder.exercise_LBL_name.setText(exercise.getName());
        holder.exercise_LBL_reps.setText("" + exercise.getReps());
        holder.exercise_LBL_breakTime.setText("" + exercise.getBreakTime());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // convenience method for getting data at click position
    Exercise getItem(int position) {
        return mData.get(position);
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private ShapeableImageView exercise_IMG_icon;
        private TextView exercise_LBL_key;
        private TextView exercise_LBL_breakTime;
        private TextView exercise_LBL_reps;
        private TextView exercise_LBL_name;

        ViewHolder(View itemView) {
            super(itemView);
            exercise_IMG_icon = itemView.findViewById(R.id.exercise_IMG_icon);
            exercise_LBL_key = itemView.findViewById(R.id.exercise_LBL_key);
            exercise_LBL_breakTime = itemView.findViewById(R.id.exercise_LBL_breakTime);
            exercise_LBL_reps = itemView.findViewById(R.id.exercise_LBL_reps);
            exercise_LBL_name = itemView.findViewById(R.id.exercise_LBL_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (exerciseItemClickListener != null) {
                        exerciseItemClickListener.itemClicked(getItem(getAdapterPosition()), getAdapterPosition());
                    }
                }
            });
        }

    }

    public interface ExerciseItemClickListener {
        void itemClicked(Exercise exercise, int position);
    }
}