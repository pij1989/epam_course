package com.pozharsky.dmitri.console;

import com.pozharsky.dmitri.authentication.PasswordAuthentication;
import com.pozharsky.dmitri.validator.PasswordValidator;

import java.util.Scanner;

public class ConsoleApp {
    private static final String EXIT = "exit";
    private static final int STATUS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordValidator passwordValidator = new PasswordValidator();
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication();
        while (true) {
            System.out.println("Enter password: ");
            String value = scanner.nextLine();
            if (value.equals(EXIT)) {
                System.exit(STATUS);
            }
            if (passwordValidator.validatePassword(value)) {
                if (passwordAuthentication.authenticate(value)) {
                    System.out.println("Authenticated");
                } else {
                    System.out.println("Incorrect password");
                }
            } else {
                System.out.println("Invalid password");
            }
        }

    }
}
