package com.pozharsky.dmitri.console;

import com.pozharsky.dmitri.entity.BirthdayDate;
import com.pozharsky.dmitri.entity.DayOfWeek;
import com.pozharsky.dmitri.entity.Month;
import com.pozharsky.dmitri.report.BirthdayReport;
import com.pozharsky.dmitri.service.BirthdayService;

import java.util.Scanner;

public class ConsoleApp {
    private static final String YES = "Y";
    private static final int STATUS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirthdayService birthdayService = new BirthdayService();
        BirthdayReport birthdayReport = new BirthdayReport();
        while (true) {
            System.out.println("Enter day of birthday:");
            int day = scanner.nextInt();
            System.out.println("Enter month of birthday:");
            int month = scanner.nextInt();
            System.out.println("Enter year of birthday:");
            int year = scanner.nextInt();
            BirthdayDate birthdayDate = new BirthdayDate(year, Month.values()[month - 1], day);
            DayOfWeek dayOfWeek = birthdayService.defineBirthdayDayOfWeek(birthdayDate);
            int fullYears = birthdayService.defineFullYearsOld(birthdayDate);
            birthdayReport.printBirthdayDayOfWeek(dayOfWeek);
            birthdayReport.printFullYearsOld(fullYears);
            if (birthdayService.isBirthdayToday(birthdayDate)) {
                birthdayReport.printCongratulations();
            }
            System.out.println("Do you want to exit? Yes [Y], No[N]");
            String value = scanner.next();
            if (value.equals(YES)) {
                System.exit(STATUS);
            }
        }
    }
}
