package com.pozharsky.dmitri.console;

import com.pozharsky.dmitri.maker.NumberListMaker;
import com.pozharsky.dmitri.report.NumberReport;
import com.pozharsky.dmitri.service.NumberService;

import java.util.List;
import java.util.Scanner;

public class ConsoleApp {
    private static final String EXIT = "exit";
    private static final int STATUS = 0;
    private static final String SUM = "S";
    private static final String MULTIPLE = "M";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberListMaker numberListMaker = new NumberListMaker();
        NumberService numberService = new NumberService();
        NumberReport numberReport = new NumberReport();
        while (true) {
            System.out.println("Enter sequence of number through comma or enter 'exit' to exit from the application:");
            String value = scanner.nextLine();
            if (value.equals(EXIT)) {
                System.exit(STATUS);
            }
            List<Integer> listNumbers = numberListMaker.makeNumberList(value);
            System.out.println("What active do you want to do? sum [S], multiple [M]:");
            String action = scanner.nextLine();
            switch (action) {
                case SUM: {
                    int sumResult = numberService.sumInteger(listNumbers);
                    numberReport.printResult(sumResult);
                    break;
                }
                case MULTIPLE: {
                    long multipleResult = numberService.multipleInteger(listNumbers);
                    System.out.println(multipleResult);
                    break;
                }
            }
        }
    }
}
