package com.pozharsky.dmitri.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class NumberServiceTest {
    private final Map<Integer, List<Integer>> data = new HashMap<>();
    private NumberService numberService;

    @BeforeMethod
    public void setUp() {
        numberService = new NumberService();
        data.put(0, List.of(-20, 20, 200, -200));
        data.put(1, List.of(-21, 29, 211, -219));
        data.put(4, List.of(-22, 28, 212, -218));
        data.put(9, List.of(-23, 27, 213, -217));
        data.put(6, List.of(-24, 26, 214, -216));
        data.put(5, List.of(-25, 25, 215, -215));
    }

    @AfterMethod
    public void tearDown() {
        numberService = null;
        data.clear();
    }

    @Test
    public void testDefineLastDigitSquareNumber() {
        for (int key : data.keySet()) {
            for (int value : data.get(key)) {
                int actual = numberService.defineLastDigitSquareNumber(value);
                assertEquals(actual, key);
            }
        }


    }
}