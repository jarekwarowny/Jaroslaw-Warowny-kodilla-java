package com.example.kodillla.good.patterns.store;

public class Mail implements InformationService {

    @Override
    public void sendMail(User user) {
        System.out.println("Potwierdzenie zakupu");
    }
}
