package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Point;

public class PointService {

    public Point defineNearestPoint(Point point1, Point point2) {
        if (point1.equals(point2)) {
            return point1;
        }
        double distance1 = defineDistance(point1);
        double distance2 = defineDistance(point2);
        return distance1 < distance2 ? point1 : point2;
    }

    private double defineDistance(Point point) {
        return Math.hypot(point.getX(), point.getY());
    }
}
