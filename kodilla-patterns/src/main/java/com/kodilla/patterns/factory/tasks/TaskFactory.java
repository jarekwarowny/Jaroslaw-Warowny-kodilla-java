package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case ShoppingTask:
                return new ShoppingTask("aaa", "rerer", 23.4);
            case PaintingTask:
                return new PaintingTask("swdw", "dss", "sds");
            case DrivingTask:
                return new DrivingTask("errer", "dsds", "sdsa");
            default:
                return null;
        }
    }
}
