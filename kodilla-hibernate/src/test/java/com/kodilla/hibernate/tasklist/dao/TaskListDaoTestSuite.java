package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "aaa";
    private static final String DESCRIPTION = "test";

    @Test
    void testFindByListName() {

        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listname = taskList.getListName();

        List<TaskList> readTasks = taskListDao.findByListName(listname);

        Assertions.assertEquals(5, readTasks.size());

        taskListDao.delete(taskList);
    }
}
