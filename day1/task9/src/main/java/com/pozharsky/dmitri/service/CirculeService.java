package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Radius;

public class CirculeService {

    public double defineSquare(Radius radius) {
        int r = radius.getRadius();
        return Math.PI * r * r;
    }

    public double defineLenght(Radius radius) {
        int r = radius.getRadius();
        return 2 * Math.PI * r;
    }
}
