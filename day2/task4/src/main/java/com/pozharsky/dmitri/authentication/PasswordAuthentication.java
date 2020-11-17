package com.pozharsky.dmitri.authentication;

public class PasswordAuthentication {
    private static final String PASSWORD_SAMPLE = "123456Ab";

    public boolean authenticate(String password) {
        return password.trim().equals(PASSWORD_SAMPLE);
    }
}
