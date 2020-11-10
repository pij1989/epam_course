package com.pozharsky.dmitri.entity;

public class Date {
    private int year;
    private Month month;

    public Date(int year, Month month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Date{");
        sb.append("year=").append(year);
        sb.append(", month=").append(month);
        sb.append('}');
        return sb.toString();
    }
}
