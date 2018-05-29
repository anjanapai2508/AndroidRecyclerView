package com.pi.androidrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private Context mContext;

    public TaskAdapter(Context mContext, List<Tasks> tasksList) {
        this.mContext = mContext;
        this.tasksList = tasksList;
    }

    private List<Tasks> tasksList;

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_layout, null);
        TaskViewHolder holder = new TaskViewHolder(view);
        return new TaskViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Tasks task = tasksList.get(position);
        holder.taskTitle.setText(task.getTaskTitle());
        holder.taskDetail.setText(task.getTaskDetails());
        holder.taskStatus.setImageDrawable(mContext.getResources().getDrawable(task.getTaskStatus()));
    }

    @Override
    public int getItemCount() {
        return tasksList.size();
    }

    class TaskViewHolder extends RecyclerView.ViewHolder {
        ImageView taskStatus;
        TextView taskTitle;
        TextView taskDetail;

        public TaskViewHolder(View itemView) {
            super(itemView);
            taskStatus = itemView.findViewById(R.id.taskStatus);
            taskTitle = itemView.findViewById(R.id.taskTitle);
            taskDetail = itemView.findViewById(R.id.taskDetail);
        }
    }
}
