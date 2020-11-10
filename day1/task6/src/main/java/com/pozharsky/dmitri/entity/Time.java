package com.pozharsky.dmitri.entity;

import java.util.Objects;

public final class Time {
    private final int hour;
    private final int minute;
    private final int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                minute == time.minute &&
                second == time.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Time{");
        sb.append("hour=").append(hour);
        sb.append(", minute=").append(minute);
        sb.append(", second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}
