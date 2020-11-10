package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Date;
import com.pozharsky.dmitri.entity.Month;
import com.pozharsky.dmitri.report.DateReport;
import com.pozharsky.dmitri.service.DateService;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2019, Month.OCTOBER);
        DateService dateService = new DateService();
        DateReport dateReport = new DateReport();
        dateReport.print(dateService.getAmountDayInMonth(date), date);
    }
}
