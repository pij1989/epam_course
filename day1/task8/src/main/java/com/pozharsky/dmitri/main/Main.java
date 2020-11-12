package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.report.FunctionReport;
import com.pozharsky.dmitri.service.FunctionService;

public class Main {
    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        double result = functionService.defineFunctionValue(2);
        FunctionReport functionReport = new FunctionReport();
        functionReport.printResult(result);
    }
}
