package com.pozharsky.dmitri.entity;

public class Square {
    private double square;

    public Square(long square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("square=").append(square);
        sb.append('}');
        return sb.toString();
    }
}
