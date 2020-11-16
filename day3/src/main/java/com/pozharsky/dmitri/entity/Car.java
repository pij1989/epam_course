package com.pozharsky.dmitri.entity;

public class Car {
    private int id;
    private Mark mark;
    private String model;
    private int yearManufacture;
    private Color color;
    private double price;
    private String registrationNumber;

    public Car() {
    }

    public Car(int id, Mark mark, String model, int yearManufacture, Color color, double price, String registrationNumber) {
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

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (yearManufacture != car.yearManufacture) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (mark != car.mark) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (color != car.color) return false;
        return registrationNumber != null ? registrationNumber.equals(car.registrationNumber) : car.registrationNumber == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearManufacture;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", mark=").append(mark);
        sb.append(", model='").append(model).append('\'');
        sb.append(", yearManufacture=").append(yearManufacture);
        sb.append(", color=").append(color);
        sb.append(", price=").append(price);
        sb.append(", registrationNumber='").append(registrationNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
