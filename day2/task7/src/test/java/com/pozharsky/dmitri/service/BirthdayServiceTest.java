package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.BirthdayDate;
import com.pozharsky.dmitri.entity.DayOfWeek;
import com.pozharsky.dmitri.entity.Month;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Calendar;

import static java.util.Calendar.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BirthdayServiceTest {
    BirthdayService birthdayService;
    Calendar calendar;
    BirthdayDate birthdayDate;

    @BeforeClass
    public void setUp() {
        birthdayService = new BirthdayService();
        birthdayDate = new BirthdayDate(2000, Month.AUGUST, 18);
        calendar = getInstance();
        calendar.set(DATE, 18);
        calendar.set(MONTH, 11);
        calendar.set(YEAR, 2020);
    }

    @AfterClass
    public void tearDown() {
        birthdayService = null;
        birthdayDate = null;
        calendar = null;
    }

    @Test
    public void testDefineBirthdayDayOfWeek() {
        DayOfWeek actual = birthdayService.defineBirthdayDayOfWeek(birthdayDate);
        DayOfWeek expect = DayOfWeek.FRIDAY;
        assertEquals(actual, expect);
    }

    @Test
    public void testDefineFullYearsOld() {
        int actual = birthdayService.defineFullYearsOld(birthdayDate, calendar);
        int expect = 20;
        assertEquals(actual, expect);
    }

    @Test
    public void testIsBirthdayTodayAndReturnTrue() {
        boolean actual = birthdayService.isBirthdayToday(birthdayDate, calendar);
        assertTrue(actual);
    }
}