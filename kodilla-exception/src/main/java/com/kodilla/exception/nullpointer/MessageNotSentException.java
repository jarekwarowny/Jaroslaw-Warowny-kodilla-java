package com.kodilla.exception.nullpointer;

public class MessageNotSentException extends Throwable {

    public MessageNotSentException(final String message) {
        super(message);
    }
}
