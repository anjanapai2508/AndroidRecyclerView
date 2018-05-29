package com.pi.androidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TaskAdapter taskAdapter;
    List<Tasks> tasksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tasksList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksList.add(
                new Tasks("Task no 1", "Not yet started", R.drawable.task_not_started)
        );
        tasksList.add(
                new Tasks("Task no 2", "Working on this one today", R.drawable.working_on_it)
        );
        tasksList.add(
                new Tasks("Task no 3", "Nearing deadline, needs attention", R.drawable.needs_attention)
        );
        tasksList.add(new Tasks("Task no 4", "Not yet started", R.drawable.task_not_started)
        );
        tasksList.add(
                new Tasks("Task no 5", "Working on this one today", R.drawable.working_on_it)
        );
        tasksList.add(
                new Tasks("Task no 6", "Nearing deadline, needs attention", R.drawable.needs_attention)
        );
        tasksList.add(
                new Tasks("Task no 7", "Not yet started", R.drawable.task_not_started)
        );
        tasksList.add(
                new Tasks("Task no 8", "Working on this one today", R.drawable.working_on_it)
        );
        tasksList.add(
                new Tasks("Task no 9", "Nearing deadline, needs attention", R.drawable.needs_attention)
        );
        taskAdapter = new TaskAdapter(this, tasksList);
        recyclerView.setAdapter(taskAdapter);
    }
}
