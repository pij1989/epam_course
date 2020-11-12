package com.pozharsky.dmitri.service;

public class FunctionService {
    public double defineFunctionValue(int number) {
        return number >= 3 ? -(number * number) + 3 * number + 9 : (double) 1 / (number * number * number - 6);
    }
}
