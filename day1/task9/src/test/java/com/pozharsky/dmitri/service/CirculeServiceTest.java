package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Radius;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CirculeServiceTest {
    CirculeService circuleService;
    Radius radius;

    @BeforeMethod
    public void setUp() {
        circuleService = new CirculeService();
        radius = new Radius(3);
    }

    @AfterMethod
    public void tearDown() {
        circuleService = null;
        radius = null;
    }

    @Test
    public void testDefineSquare() {
        double actual = circuleService.defineSquare(radius);
        assertEquals(actual,28.274333882308138);
    }

    @Test
    public void testDefineLenght() {
        double actual = circuleService.defineLenght(radius);
        assertEquals(actual,18.84955592153876);
    }
}
