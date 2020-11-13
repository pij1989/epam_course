package com.pozharsky.dmitri.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class NumberServiceTest {
    private NumberService numberService;

    @BeforeMethod
    public void setUp() {
        numberService = new NumberService();
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {0, -20}, {0, 20}, {0, 200}, {0, -200},
                {1, -21}, {1, 29}, {1, 211}, {1, 219},
                {4, -22}, {4, 28}, {4, 212}, {4, -218},
                {9, -23}, {9, 27}, {9, 213}, {9, -217},
                {6, -24}, {6, 26}, {6, 214}, {6, -216},
                {5, -25}, {5, 25}, {5, 215}, {5, -215},
        };
    }

    @AfterMethod
    public void tearDown() {
        numberService = null;
    }

    @Test(dataProvider = "getData")
    public void testDefineLastDigitSquareNumber(int expect, int number) {
        int actual = numberService.defineLastDigitSquareNumber(number);
        assertEquals(actual, expect);
    }
}