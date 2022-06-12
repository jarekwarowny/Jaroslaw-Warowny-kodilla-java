package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student student1 = new Student_1();
        Student student2 = new Student_2();
        Teacher teacher = new Teacher("Teacher");
        student1.registerObserver(teacher);
        student2.registerObserver(teacher);
        //When
        student1.addTask("New task for student 1");
        student2.addTask("New task for student 2");
        //Then
        Assertions.assertEquals(2, teacher.getCount());
    }
}
