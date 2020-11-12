package com.pozharsky.dmitri.entity;

public class Segment {
    private int begin;
    private int end;
    private int step;

    public Segment(int begin, int end, int step) {
        this.begin = begin;
        this.end = end;
        this.step = step;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Segment{");
        sb.append("begin=").append(begin);
        sb.append(", end=").append(end);
        sb.append(", step=").append(step);
        sb.append('}');
        return sb.toString();
    }
}
