package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PointServiceTest {
    PointService pointService;
    Point point1;
    Point point2;

    @BeforeMethod
    public void setUp() {
        pointService = new PointService();
        point1 = new Point(3, 4);
        point2 = new Point(5, 7);
    }

    @AfterMethod
    public void tearDown() {
        pointService = null;
        point1 = null;
        point2 = null;
    }

    @Test
    public void testDefineNearestPoint() {
        Point actual = pointService.defineNearestPoint(point1, point2);
        assertEquals(actual, point1);
    }
}
