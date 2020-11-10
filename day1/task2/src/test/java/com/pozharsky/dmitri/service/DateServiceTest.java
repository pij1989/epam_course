package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Date;
import com.pozharsky.dmitri.entity.Month;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DateServiceTest {
    private DateService dateService;

    @BeforeMethod
    public void setUp() {
        dateService = new DateService();
    }

    @AfterMethod
    public void tearDown() {
        dateService = null;
    }

    @Test
    public void testGetAmountDayInMonth() {
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.FEBRUARY)), 29);
        assertEquals(dateService.getAmountDayInMonth(new Date(2019, Month.FEBRUARY)), 28);
        assertEquals(dateService.getAmountDayInMonth(new Date(1800, Month.FEBRUARY)), 28);
        assertEquals(dateService.getAmountDayInMonth(new Date(2000, Month.FEBRUARY)), 29);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.JANUARY)), 31);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.MARCH)), 31);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.APRIL)), 30);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.MAY)), 31);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.JUNE)), 30);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.JULY)), 31);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.AUGUST)), 31);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.SEPTEMBER)), 30);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.OCTOBER)), 31);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.NOVEMBER)), 30);
        assertEquals(dateService.getAmountDayInMonth(new Date(2020, Month.DECEMBER)), 31);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void testGetAmountDayInMonthAndThrowExeption() {
        dateService.getAmountDayInMonth(null);
    }
}