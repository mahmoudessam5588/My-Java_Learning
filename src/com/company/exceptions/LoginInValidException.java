package com.company.exceptions;

public  class LoginInValidException extends Exception {
    public LoginInValidException() {
        super("Invalid Login");
    }

    public LoginInValidException(String message) {
        super(message);
    }
}