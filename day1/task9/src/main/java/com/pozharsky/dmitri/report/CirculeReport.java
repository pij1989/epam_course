package com.pozharsky.dmitri.report;

import com.pozharsky.dmitri.entity.Radius;

public class CirculeReport {
    public void printSquare(Radius radius, double square) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("The square of circule, which radius ").append(radius).append(" is ").append(square));
    }

    public void printLenght(Radius radius, double lenght) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("The lenght of circule, which radius ").append(radius).append(" is ").append(lenght));
    }
}
