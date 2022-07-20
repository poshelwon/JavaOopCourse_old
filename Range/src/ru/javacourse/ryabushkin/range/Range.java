package ru.javacourse.ryabushkin.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double from() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double to() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public String toString() {
        return "(" + from + "; " + to + ")";
    }

    public boolean isInside(double number) {
        return from <= number && number <= to;
    }

    public Range getIntersection(Range range) {
        if (to <= range.from() || from >= range.to()) {
            return null;
        }

        return new Range(Math.max(from, range.from), Math.min(to, range.to));
    }

    public Range[] getUnion(Range range) {
        if (to <= range.from() || from >= range.to()) {
            if (from == range.to() || to == range.from()) {
                return new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
            }

            return new Range[]{new Range(from, to), range};
        }

        return new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
    }

    public Range[] getDifference(Range range) {
        if (to <= range.from() || from >= range.to()) { // 6
            return new Range[]{new Range(from, to)};
        }

        if (from >= range.from && to > range.to) { // 5, 7
            return new Range[]{new Range(range.to, to)};
        }

        if (from < range.from() && to <= range.to()) { // 4, 8
            return new Range[]{new Range(from, range.from)};
        }

        if (from < range.from() && to > range.to()) {  // 2
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        }

        return new Range[]{};
    }
}