package com.pozharsky.dmitri.report;

import com.pozharsky.dmitri.entity.DayOfWeek;

public class BirthdayReport {
    public void printBirthdayDayOfWeek(DayOfWeek dayOfWeek) {
        System.out.println("Birthday day of week is " + dayOfWeek);
    }

    public void printFullYearsOld(int years) {
        System.out.println("Full years old is " + years);
    }

    public void printCongratulations() {
        System.out.println("Happy birthday!");
    }
}
