package com.pozharsky.dmitri.util;

import com.pozharsky.dmitri.entity.Time;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TimeUtilTest {
    private Time expectTime;

    @BeforeMethod
    public void setUp() {
        expectTime = new Time(3, 20, 0);
    }

    @AfterMethod
    public void tearDown() {
        expectTime = null;
    }

    @Test
    public void testConvertSecondToTime() {
        Time actualTime = TimeUtil.convertSecondToTime(12000);
        assertEquals(actualTime, expectTime);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void testConvertSecondToTimeAndThrowException() {
        TimeUtil.convertSecondToTime(86420);
    }

}
