package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.report.NumberReport;
import com.pozharsky.dmitri.service.NumberService;

public class Main {
    public static void main(String[] args) {
        int number = 99;
        NumberService numberService = new NumberService();
        NumberReport numberReport = new NumberReport();
        numberService.defineLastDigitSquareNumber(number);
        numberReport.printLastDigitSquareNumber(number, numberService.defineLastDigitSquareNumber(number));
    }
}
