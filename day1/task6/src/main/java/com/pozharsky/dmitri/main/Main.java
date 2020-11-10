package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Time;
import com.pozharsky.dmitri.report.TimeReport;
import com.pozharsky.dmitri.util.TimeUtil;

public class Main {
    public static void main(String[] args) {
        int second = 12000;
        TimeReport timeReport = new TimeReport();
        Time time = TimeUtil.convertSecondToTime(second);
        timeReport.printTime(second, time);
    }
}
