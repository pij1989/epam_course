package com.pozharsky.dmitri.main;

import com.pozharsky.dmitri.entity.Segment;
import com.pozharsky.dmitri.report.SegmentReport;
import com.pozharsky.dmitri.service.SegmentService;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Segment segment = new Segment(30, 90, 10);
        SegmentService segmentService = new SegmentService();
        Map<Integer, Double> result = segmentService.defineTangencOnSegment(segment);
        SegmentReport segmentReport = new SegmentReport();
        segmentReport.printResult(result);
    }
}
