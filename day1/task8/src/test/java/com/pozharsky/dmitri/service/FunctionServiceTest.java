package com.pozharsky.dmitri.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FunctionServiceTest {
    FunctionService functionService;
    int numberMoreThree;
    int numberLessThree;

    @BeforeMethod
    public void setUp() {
        functionService = new FunctionService();
        numberMoreThree = 4;
        numberLessThree = 2;
    }

    @AfterMethod
    public void tearDown() {
        functionService = null;
        numberMoreThree = 0;
        numberLessThree = 0;
    }

    @Test
    public void testDefineFunctionValue() {
        double actual1 = functionService.defineFunctionValue(numberMoreThree);
        assertEquals(actual1, 5.0);
        double actual2 = functionService.defineFunctionValue(numberLessThree);
        assertEquals(actual2, 0.5);
    }
}
