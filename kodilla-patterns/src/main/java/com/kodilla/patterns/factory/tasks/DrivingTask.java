package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving task executed");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (using.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
