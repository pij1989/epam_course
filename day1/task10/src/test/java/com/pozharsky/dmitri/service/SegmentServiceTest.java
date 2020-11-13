package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Segment;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;

public class SegmentServiceTest {
    SegmentService segmentService;
    Segment segment;

    @BeforeMethod
    public void setUp() {
        segmentService = new SegmentService();
        segment = new Segment(30, 50, 10);
    }

    @AfterMethod
    public void tearDown() {
        segmentService = null;
        segment = null;
    }

    @Test
    public void testDefineTangencOnSegment() {
        Map<Integer, Double> actual = segmentService.defineTangencOnSegment(segment);
        assertEquals(actual, Map.of(30, 0.5773502691896257, 40, 0.8390996311772799, 50, 1.19175359259421));
    }
}
