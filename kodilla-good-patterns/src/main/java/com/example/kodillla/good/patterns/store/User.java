package com.example.kodillla.good.patterns.store;

public class User {

    private String name;
    private String userId;
    private String mail;

    public User(String name, String userId, String mail) {
        this.name = name;
        this.userId = userId;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getMail() {
        return mail;
    }
}
