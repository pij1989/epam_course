package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Square;
import com.pozharsky.dmitri.report.SquareReport;
import com.pozharsky.dmitri.service.SquareService;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(150);
        SquareService squareService = new SquareService();
        SquareReport squareReport = new SquareReport();
        squareReport.printSquare(squareService.defineSquareAreaInCircle(square));
    }
}
