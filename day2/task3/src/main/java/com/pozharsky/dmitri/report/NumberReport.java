package com.pozharsky.dmitri.report;

public class NumberReport {
    public void printNumber(int[] numbers) {
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void printWithNewLine(int[] numbers) {
        System.out.println("Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
