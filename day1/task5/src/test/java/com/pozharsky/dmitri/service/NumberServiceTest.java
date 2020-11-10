package com.pozharsky.dmitri.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    private NumberService numberService;

    @BeforeMethod
    public void setUp() {
        numberService = new NumberService();
    }

    @AfterMethod
    public void tearDown() {
        numberService = null;
    }

    @Test
    public void testIsPerfectNumber() {
        assertTrue(numberService.isPerfectNumber(28));
        assertFalse(numberService.isPerfectNumber(20));
    }
}
