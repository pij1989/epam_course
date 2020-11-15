package com.pozharsky.dmitri.generator;

import java.util.Random;

public class NumberGenerator {
    private static final int BOUND = 200;

    public int[] generateIntNumbers(int amount) {
        Random random = new Random();
        int[] result = new int[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = random.nextInt(BOUND);
        }
        return result;
    }
}
