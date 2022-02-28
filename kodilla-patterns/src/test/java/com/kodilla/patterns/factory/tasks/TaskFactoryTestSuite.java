package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.ShoppingTask);
        Assertions.assertEquals("aaa", shoppingTask.getTaskName());
    }

    @Test
    void testPaintingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.makeTask(TaskFactory.PaintingTask);
        Assertions.assertEquals("swdw", paintingTask.getTaskName());
    }
    @Test
    void testDrivingTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DrivingTask);
        Assertions.assertEquals("errer", drivingTask.getTaskName());
    }
}
