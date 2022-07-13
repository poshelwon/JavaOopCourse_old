package ru.javacourse.ryabushkin.range;

public class Range {
    private double from;
    private double to;

    public Range() {
    }
    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }


    public double getTo() {
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

    public Range getIntersection(Range range) {
        if (this.to < range.getFrom() || range.getTo() < this.from) {
            return null;
        }

        Range intersectionRange = new Range();

        intersectionRange.setFrom(Math.max(this.from, range.getFrom()));
        intersectionRange.setTo(Math.min(this.to, range.getTo()));

        return intersectionRange;
    }
}
