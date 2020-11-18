package com.pozharsky.dmitri.entity;

public class DeadlineDateTime {
    private int year;
    private Month month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public DeadlineDateTime() {
    }

    public DeadlineDateTime(int year, Month month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeadlineDateTime that = (DeadlineDateTime) o;

        if (year != that.year) return false;
        if (day != that.day) return false;
        if (hour != that.hour) return false;
        if (minute != that.minute) return false;
        if (second != that.second) return false;
        return month == that.month;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + day;
        result = 31 * result + hour;
        result = 31 * result + minute;
        result = 31 * result + second;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeadlineDateTime{");
        sb.append("year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", day=").append(day);
        sb.append(", hour=").append(hour);
        sb.append(", minute=").append(minute);
        sb.append(", second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}
