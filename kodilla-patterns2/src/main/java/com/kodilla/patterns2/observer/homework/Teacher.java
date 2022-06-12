package com.kodilla.patterns2.observer.homework;

public class Teacher implements  Observer {

    private final String name;
    private int count;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + "Task: " + student.getName());
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
