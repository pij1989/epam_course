package com.pozharsky.dmitri.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String REG_EX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";

    public boolean validatePassword(String password) {
        Pattern passwordPattern = Pattern.compile(REG_EX_PASSWORD);
        Matcher matcher = passwordPattern.matcher(password.trim());
        return matcher.matches();
    }
}
