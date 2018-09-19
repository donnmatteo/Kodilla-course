package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void updateHomework(StudentTasks studentTasks) {
        System.out.println(username + ": New message in topic " + studentTasks.getName() + "\n" +
                " (total: " + studentTasks.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
