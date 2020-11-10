package com.pozharsky.dmitri.util;

import com.pozharsky.dmitri.entity.Time;

public final class TimeUtil {

    public TimeUtil() { };

    public static Time convertSecondToTime(int second){
        int sec, m, min, hour;
        sec = second % 60;
        m = (second - sec) / 60;
        min = m % 60;
        hour = (m - min) / 60;
        return new Time(hour,min,second);
    }
}
