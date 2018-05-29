package com.pi.androidrecyclerview;

public class Tasks {

    private String taskTitle;
    private String taskDetails;
    private int taskStatus;

    public Tasks(String taskTitle, String taskDetails, int taskStatus) {
        this.taskTitle = taskTitle;
        this.taskDetails = taskDetails;
        this.taskStatus = taskStatus;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }
}
