package com.example.testfirestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRVAdapter extends RecyclerView.Adapter<CourseRVAdapter.ViewHolder> {
    // creating variables for our ArrayList and context
    private ArrayList<Courses> coursesArrayList;
    private Context context;

    // creating constructor for our adapter class
    public CourseRVAdapter(ArrayList<Courses> coursesArrayList, Context context) {
        this.coursesArrayList = coursesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // passing our layout file for displaying our card item
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.course_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseRVAdapter.ViewHolder holder, int position) {
        // setting data to our text views from our modal class.
        Courses courses = coursesArrayList.get(position);
        holder.NameTV.setText(courses.getName());
        holder.TasteTV.setText(courses.getTaste());
        holder.courseDescTV.setText(courses.getPrice());
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list.
        return coursesArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our text views.
        private final TextView NameTV;
        private final TextView TasteTV;
        private final TextView courseDescTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views.
            NameTV = itemView.findViewById(R.id.idTVName);
            TasteTV = itemView.findViewById(R.id.idTVTaste);
            courseDescTV = itemView.findViewById(R.id.idTVPrice);
        }
    }
}
