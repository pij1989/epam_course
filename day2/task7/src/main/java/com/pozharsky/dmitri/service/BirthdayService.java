package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.BirthdayDate;
import com.pozharsky.dmitri.entity.DayOfWeek;

import java.util.Calendar;

import static java.util.Calendar.*;

public class BirthdayService {

    public DayOfWeek defineBirthdayDayOfWeek(BirthdayDate birthdayDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, birthdayDate.getYear());
        calendar.set(MONTH, birthdayDate.getMonth().getValue() - 1);
        calendar.set(DATE, birthdayDate.getDay());
        return DayOfWeek.values()[calendar.get(DAY_OF_WEEK) - 2];
    }

    public int defineFullYearsOld(BirthdayDate birthdayDate, Calendar calendar) {
        return calendar.get(YEAR) - birthdayDate.getYear();
    }

    public boolean isBirthdayToday(BirthdayDate birthdayDate, Calendar calendar) {
        return calendar.get(DATE) == birthdayDate.getDay();
    }
}
