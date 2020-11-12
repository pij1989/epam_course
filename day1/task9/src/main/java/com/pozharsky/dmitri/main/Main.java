package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Radius;
import com.pozharsky.dmitri.report.CirculeReport;
import com.pozharsky.dmitri.service.CirculeService;

public class Main {
    public static void main(String[] args) {
        Radius radius = new Radius(3);
        CirculeService circuleService = new CirculeService();
        double square = circuleService.defineSquare(radius);
        double lenght = circuleService.defineLenght(radius);
        CirculeReport circuleReport = new CirculeReport();
        circuleReport.printSquare(radius, square);
        circuleReport.printLenght(radius, lenght);
    }
}
