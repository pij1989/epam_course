package com.pozharsky.dmitri.generator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberGeneratorTest {
    static final int AMOUNT = 7;
    NumberGenerator numberGenerator;

    @BeforeMethod
    public void setUp() {
        numberGenerator = new NumberGenerator();
    }

    @AfterMethod
    public void tearDown() {
        numberGenerator = null;
    }

    @Test
    public void testGenerateIntNumbers() {
        int[] numbers = numberGenerator.generateIntNumbers(AMOUNT);
        int actual = numbers.length;
        int expect = AMOUNT;
        assertEquals(actual, expect);
    }
}
