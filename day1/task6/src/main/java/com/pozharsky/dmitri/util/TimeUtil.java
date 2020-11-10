package com.pozharsky.dmitri.util;

import com.pozharsky.dmitri.entity.Time;

public final class TimeUtil {

    private TimeUtil() { }

    public static Time convertSecondToTime(int second) {
        if (second < 0 || second > 86400) {
            throw new IllegalArgumentException("Amount second in day cannot be less then 0 and more then 86400");
        }
        if (second == 0) {
            return new Time(0, 0, 0);
        } else {
            int sec, m, min, hour;
            sec = second % 60;
            m = (second - sec) / 60;
            min = m % 60;
            hour = (m - min) / 60;
            return new Time(hour, min, sec);
        }
    }
}
