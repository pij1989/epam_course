package com.pozharsky.dmitri.service;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class NumberServiceTest {
    NumberService numberService;

    @BeforeClass
    public void setUp() {
        numberService = new NumberService();
    }

    @DataProvider
    public Object[][] getDataForSum() {
        return new Object[][]{
                {15, List.of(1, 2, 3, 4, 5)},
                {17, List.of(1, 2, 3, 4, 7)},
                {170, List.of(10, 20, 30, 40, 70)},
                {81, List.of(5, 8, 13, 21, 34)},
                {53, List.of(5, 7, 11, 13, 17)},
        };
    }

    @DataProvider
    public Object[][] getDataForMultiple() {
        return new Object[][]{
                {120, List.of(1, 2, 3, 4, 5)},
                {168, List.of(1, 2, 3, 4, 7)},
                {16_800_000, List.of(10, 20, 30, 40, 70)},
                {371_280, List.of(5, 8, 13, 21, 34)},
                {85_085, List.of(5, 7, 11, 13, 17)},
        };
    }

    @AfterClass
    public void tearDown() {
        numberService = null;
    }

    @Test(dataProvider = "getDataForSum")
    public void testSumInteger(int expect, List<Integer> numbers) {
        int actual = numberService.sumInteger(numbers);
        Assert.assertEquals(actual, expect);
    }

    @Test(dataProvider = "getDataForMultiple")
    public void testMultipleInteger(long expect, List<Integer> numbers) {
        long actual = numberService.multipleInteger(numbers);
        Assert.assertEquals(actual, expect);
    }
}