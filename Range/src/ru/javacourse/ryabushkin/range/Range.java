package ru.javacourse.ryabushkin.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom(double from) {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }


    public double getTo(double to) {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return from <= number && number <= to;
    }
}
