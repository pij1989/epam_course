package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.report.NumberReport;
import com.pozharsky.dmitri.service.NumberService;

public class Main {
    public static void main(String[] args) {
        int number = 28;
        NumberService numberService = new NumberService();
        NumberReport numberReport = new NumberReport();
        numberReport.printPerfectNumber(numberService.isPerfectNumber(number), number);
    }
}
