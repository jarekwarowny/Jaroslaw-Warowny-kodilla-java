package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int peselId;
    private final String username;
    private final char sex;
    private final LocalDate date;
    private final int numberOfPosts;

    public ForumUser(int peselId, String username, char sex, LocalDate date, int numberOfPosts) {
        this.peselId = peselId;
        this.username = username;
        this.sex = sex;
        this.date = date;
        this.numberOfPosts = numberOfPosts;
    }

    public int getPeselId() {
        return peselId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "Id: "+ peselId + " " + "Username: " + username + " " + "Sex: " + sex + " " + "Date: " + date + " " + "Number of posts: " + numberOfPosts;
    }
}
