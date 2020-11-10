package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Date;
import com.pozharsky.dmitri.entity.Month;

public class DateService {

    public int getAmountDayInMonth(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Date can not be null");
        }
        int amountDayInMonth;
        int year = date.getYear();
        Month month = date.getMonth();
        if (month == Month.FEBRUARY) {
            amountDayInMonth = isLeapYear(year) ? 29 : 28;
        } else {
            amountDayInMonth = (month.getValue() % 2 != 0 && month.getValue() < Month.AUGUST.getValue())
                    || (month.getValue() % 2 == 0 && month.getValue() >= Month.AUGUST.getValue()) ? 31 : 30;
        }
        return amountDayInMonth;
    }

    private boolean isLeapYear(int year) {
        if (year == 0) {
            throw new IllegalArgumentException("Zero year does not exist");
        }
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }
}
