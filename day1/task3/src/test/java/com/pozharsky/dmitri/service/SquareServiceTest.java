package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Square;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SquareServiceTest {
    private SquareService squareService;
    private Square square;

    @BeforeMethod
    public void setUp() {
        squareService = new SquareService();
        square = new Square(9);
    }

    @AfterMethod
    public void tearDown() {
        squareService = null;
        square = null;
    }

    @Test
    public void testDefineSquareAreaInCircle() {
        assertEquals(squareService.defineSquareAreaInCircle(square), 4.5);
    }
}