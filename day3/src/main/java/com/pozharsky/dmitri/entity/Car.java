package com.pozharsky.dmitri.entity;

import java.util.Objects;

public class Car {
    private int id;
    private String mark;
    private String model;
    private int yearManufacture;
    private String color;
    private double price;

    public Car() {
    }

    public Car(int id, String mark, String model, int yearManufacture, String color, double price, String registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private String registrationNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getId() == car.getId() &&
                getYearManufacture() == car.getYearManufacture() &&
                Double.compare(car.getPrice(), getPrice()) == 0 &&
                Objects.equals(getMark(), car.getMark()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getRegistrationNumber(), car.getRegistrationNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMark(), getModel(), getYearManufacture(), getColor(), getPrice(), getRegistrationNumber());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", mark='").append(mark).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", yearManufacture=").append(yearManufacture);
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", registrationNumber='").append(registrationNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
