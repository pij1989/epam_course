package com.pozharsky.dmitri;

import com.pozharsky.dmitri.entity.IntegerArray;
import com.pozharsky.dmitri.excepton.IntegerArrayException;
import com.pozharsky.dmitri.maker.IntegerArrayMaker;
import com.pozharsky.dmitri.reader.IntegerReader;
import com.pozharsky.dmitri.report.IntegerArrayReport;
import com.pozharsky.dmitri.service.IntegerArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IntegerArrayException, IOException {
        Scanner scanner = new Scanner(System.in);
        IntegerArrayMaker integerArrayMaker = new IntegerArrayMaker();
        IntegerArrayReport integerArrayReport = new IntegerArrayReport();
        IntegerArrayService integerArrayService = new IntegerArrayService();
        IntegerArray integerArray1 = integerArrayMaker.makeFromFile(new IntegerReader(), "data\\integers.txt");
        System.out.println(Arrays.toString(integerArray1.getArray()));
        integerArrayService.quickSort(integerArray1);
        System.out.println(integerArray1);
        //int i = Arrays.binarySearch(integerArray1.getArray(),3);
        int i = integerArrayService.binarySearch(integerArray1, 3);
        System.out.println(i);
        integerArrayService.primeNumbers(integerArray1);
        System.out.println(integerArrayService.primeNumbers(new IntegerArray(List.of(17, 3, 31, 24, 12))));
        System.out.println(integerArrayService.fibonaciNumbers(new IntegerArray(List.of(0,1,2,3,4,5,6,7,8,13))));
        System.out.println(integerArrayService.defineThreeDigitNumberWithoutSameDigit(new IntegerArray(List.of(895,778,655,231))));
      /*  while (true){
            IntegerArray integerArray2 = integerArrayMaker.makeFromRandomInteger(new IntegerGenerator(), 10, 0, 100);
            integerArrayReport.printIntegerArray(integerArray2);
            integerArrayService.mergeSort(integerArray2);
            integerArrayReport.printIntegerArray(integerArray2);
            scanner.nextLine();
        }*/
    }
}
