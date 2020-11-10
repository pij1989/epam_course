package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Square;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SquareServiceTest {
    private SquareService squareService;

    @BeforeMethod
    public void setUp() {
        squareService = new SquareService();
    }

    @AfterMethod
    public void tearDown() {
        squareService = null;
    }

    @Test
    public void testDefineSquareAreaInCircle() {
        assertEquals(squareService.defineSquareAreaInCircle(new Square(9)), 4.5);
    }
}