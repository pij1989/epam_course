package com.pozharsky.dmitri.console;

import java.util.Scanner;

public class Hello {
    private static final String EXIT = "exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            if (name.equals(EXIT)) {
                System.exit(0);
            }
            System.out.println("Name is " + name);
        }
    }
}
