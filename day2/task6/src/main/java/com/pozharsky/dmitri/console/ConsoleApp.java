package com.pozharsky.dmitri.console;

import com.pozharsky.dmitri.entity.DeadlineDateTime;
import com.pozharsky.dmitri.report.DateTimeReport;
import com.pozharsky.dmitri.service.DateTimeService;

import java.util.Calendar;
import java.util.Scanner;

public class ConsoleApp {
    private static final String EXIT = "exit";
    private static final int STATUS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        DateTimeService dateService = new DateTimeService();
        DateTimeReport dateTimeReport = new DateTimeReport();
        while (true) {
            System.out.println("Enter the last name of developer:");
            String value = scanner.nextLine();
            if (value.equals(EXIT)) {
                System.exit(STATUS);
            }
            System.out.println("Enter amount of day which need to do task:");
            int amountDay = Integer.parseInt(scanner.nextLine());
            DeadlineDateTime deadlineDate = dateService.defineDeadlineDate(amountDay, calendar);
            System.out.println("Last name of developer: " + value);
            dateTimeReport.printDeadlineDateTime(deadlineDate);
        }
    }
}
