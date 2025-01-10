package com.example.chatgpt.exception;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}