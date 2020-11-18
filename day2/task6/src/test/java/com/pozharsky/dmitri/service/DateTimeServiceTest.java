package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.DeadlineDateTime;
import com.pozharsky.dmitri.entity.Month;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Calendar;

import static java.util.Calendar.*;

public class DateTimeServiceTest {
    DateTimeService dateTimeService;
    Calendar calendar;
    int amountDay;

    @BeforeClass
    public void setUp() {
        dateTimeService = new DateTimeService();
        calendar = getInstance();
        calendar.set(YEAR, 2020);
        calendar.set(MONTH, 10);
        calendar.set(DATE, 18);
        calendar.set(HOUR, 2);
        calendar.set(MINUTE, 39);
        calendar.set(SECOND, 33);
        amountDay = 9;
    }

    @AfterClass
    public void tearDown() {
        dateTimeService = null;
        calendar = null;
        amountDay = 0;
    }

    @Test
    public void testDefineDeadlineDate() {
        DeadlineDateTime expect = new DeadlineDateTime(2020, Month.NOVEMBER, 27, 2, 39, 33);
        DeadlineDateTime actual = dateTimeService.defineDeadlineDate(amountDay, calendar);
        Assert.assertEquals(actual, expect);
    }
}