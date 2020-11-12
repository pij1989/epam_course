package com.pozharsky.dmitri.service;

import com.pozharsky.dmitri.entity.Segment;

import java.util.LinkedHashMap;
import java.util.Map;

public class SegmentService {
    public Map<Integer, Double> defineTangencOnSegment(Segment segment) {
        Map<Integer, Double> map = new LinkedHashMap<>();
        int count = segment.getBegin();
        while (count <= segment.getEnd()) {
            map.put(count, Math.tan(Math.toRadians(count)));
            count += segment.getStep();
        }
        return map;
    }
}
