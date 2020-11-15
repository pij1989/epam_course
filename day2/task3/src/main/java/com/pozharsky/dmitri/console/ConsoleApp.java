package com.pozharsky.dmitri.console;

import com.pozharsky.dmitri.generator.NumberGenerator;
import com.pozharsky.dmitri.report.NumberReport;

import java.util.Scanner;

public class ConsoleApp {
    private static final String YES = "Y";
    private static final String NO = "N";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberReport numberReport = new NumberReport();
        while (true) {
            System.out.println("Enter amount of random numbers:");
            int amount = scanner.nextInt();
            System.out.println("Do you want to print each number with a new line? ([Y] yes, [N] no)");
            String arg = scanner.next();
            int[] numbers = numberGenerator.generateIntNumbers(amount);
            if (arg.equals(YES)) {
                numberReport.printWithNewLine(numbers);
            } else if (arg.equals(NO)) {
                numberReport.printNumber(numbers);
            } else {
                System.out.println("Illegal argument, try again");
            }
            System.out.println("Do you want exit? ([Y] yes, [N] no)");
            String exit = scanner.next();
            if (exit.equals(YES)) {
                System.exit(0);
            }
        }
    }
}
