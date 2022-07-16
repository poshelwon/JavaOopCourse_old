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
        if (this.to <= range.getFrom() || this.from >= range.getTo()) {
            return null;
        }

        Range rangesIntersection = new Range();

        rangesIntersection.setFrom(Math.max(this.from, range.getFrom()));
        rangesIntersection.setTo(Math.min(this.to, range.getTo()));

        return rangesIntersection;
    }

    public Range[] getUnion(Range range) {
        if (this.getIntersection(range) == null) {
            if (this.from == range.getTo() || this.to == range.getFrom()) {
                Range[] rangesUnion = new Range[1];

                Range tempRange = new Range();

                tempRange.setFrom(Math.min(this.from, range.getFrom()));
                tempRange.setTo(Math.max(this.to, range.getTo()));

                rangesUnion[0] = tempRange;

                return rangesUnion;
            }

            Range[] rangesUnion = new Range[2];

            rangesUnion[0] = this;
            rangesUnion[1] = range;

            return rangesUnion;
        }

        Range[] rangesUnion = new Range[1];

        Range tempRange = new Range();

        tempRange.setFrom(Math.min(this.from, range.getFrom()));
        tempRange.setTo(Math.max(this.to, range.getTo()));

        rangesUnion[0] = tempRange;

        return rangesUnion;
    }

    public Range[] getComplement(Range range) {
        Range[] rangesComplement;

        if (getIntersection(range) == null) { // 6
            rangesComplement = new Range[1];

            rangesComplement[0] = this;

            return rangesComplement;
        }

        if (this.from > range.getFrom() && this.to > range.getTo()) { // 5
            rangesComplement = new Range[1];

            Range tempRange = new Range();

            tempRange.setFrom(range.getTo());
            tempRange.setTo(this.to);

            rangesComplement[0] = tempRange;

            return rangesComplement;
        }

        if (this.from < range.getFrom() && this.to < range.getTo()) { // 4
            rangesComplement = new Range[1];

            Range tempRange = new Range();

            tempRange.setFrom(this.from);
            tempRange.setTo(range.getFrom());

            rangesComplement[0] = tempRange;

            return rangesComplement;
        }

        if (this.from < range.getFrom() && this.to > range.getTo()) {  // 2
            rangesComplement = new Range[2];

            Range tempRange1 = new Range();

            tempRange1.setFrom(this.from);
            tempRange1.setTo(range.getFrom());

            rangesComplement[0] = tempRange1;

            Range tempRange2 = new Range();

            tempRange2.setFrom(range.getTo());
            tempRange2.setTo(this.to);

            rangesComplement[1] = tempRange2;

            return rangesComplement;
        }

       /* if (this.from >= range.getFrom() && this.to <= range.getTo()) { // 1, 3
            return null;
        } */
        return null;
    }
}
