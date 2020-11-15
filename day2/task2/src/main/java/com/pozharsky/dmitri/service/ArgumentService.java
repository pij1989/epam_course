package com.pozharsky.dmitri.service;

public class ArgumentService {

    public String[] reverseArguments(String[] arguments) {
        int lastIndex = arguments.length - 1;
        for (int i = 0; i < arguments.length / 2; i++) {
            String last = arguments[lastIndex - i];
            arguments[lastIndex - i] = arguments[i];
            arguments[i] = last;
        }
        return arguments;
    }
}
