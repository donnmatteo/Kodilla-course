package com.kodilla.patterns.factory.tasks;


public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING";
    public static final String PAINTINGTASK = "PAINTING";
    public static final String DRIVINGTASK = "DRIVING";

    public final Task makeShape(final String shapeClass) {
        switch(shapeClass) {
            case SHOPPINGTASK: return new ShoppingTask("Birthday shopping", "Cake", 1);
            case PAINTINGTASK: return new PaintingTask("Painting classes", "Pink", "Flower");
            case DRIVINGTASK: return new DrivingTask("Turning left", "Driving school", "Multipla");
            default: return null;
        }
    }
}
