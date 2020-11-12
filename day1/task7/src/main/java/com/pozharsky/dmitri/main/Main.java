package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Point;
import com.pozharsky.dmitri.report.PointReport;
import com.pozharsky.dmitri.service.PointService;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(7,4);
        PointService pointService = new PointService();
        Point result = pointService.defineNearestPoint(point1,point2);
        PointReport pointReport = new PointReport();
        pointReport.printPoint(result);
    }
}
