package com.pozharsky.dmitri.console;

import com.pozharsky.dmitri.report.ArgumentReport;
import com.pozharsky.dmitri.service.ArgumentService;

public class ConsoleApp {
    public static void main(String[] args) {
        ArgumentService argumentService = new ArgumentService();
        String[] reverseArguments = argumentService.reverseArguments(args);
        ArgumentReport argumentReport = new ArgumentReport();
        argumentReport.printReverseArguments(reverseArguments);
    }
}
