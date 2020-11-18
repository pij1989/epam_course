package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.DeadlineDateTime;
import com.pozharsky.dmitri.entity.Month;

import java.util.Calendar;

import static java.util.Calendar.*;

public class DateTimeService {

    public DeadlineDateTime defineDeadlineDate(int amountDay, Calendar calendar) {
        calendar.add(DATE, amountDay);
        int year = calendar.get(YEAR);
        int month = calendar.get(MONTH);
        int day = calendar.get(DATE);
        int hour = calendar.get(HOUR);
        int minute = calendar.get(MINUTE);
        int second = calendar.get(SECOND);
        return new DeadlineDateTime(year, Month.values()[month], day, hour, minute, second);
    }

}


