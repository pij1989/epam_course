package com.pozharsky.dmitri.entity;

public class Radius {
    private int radius;

    public Radius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Radius{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
