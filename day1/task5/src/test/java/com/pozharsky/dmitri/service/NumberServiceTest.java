package com.pozharsky.dmitri.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    private NumberService numberService;
    private int perfectNumber;
    private int unperfectNumber;

    @BeforeMethod
    public void setUp() {
        numberService = new NumberService();
        perfectNumber = 28;
        unperfectNumber = 20;
    }

    @AfterMethod
    public void tearDown() {
        numberService = null;
        perfectNumber = 0;
        unperfectNumber = 0;
    }

    @Test
    public void testIsPerfectNumber() {
        assertTrue(numberService.isPerfectNumber(perfectNumber));
        assertFalse(numberService.isPerfectNumber(unperfectNumber));
    }
}
