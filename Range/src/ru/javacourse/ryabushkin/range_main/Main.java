package ru.javacourse.ryabushkin.range_main;

import ru.javacourse.ryabushkin.range.Range;

public class Main {
    public static void main(String[] args) {
        double oneRangeBegin = 0;
        double oneRangeEnd = 4;

        Range range = new Range(oneRangeBegin, oneRangeEnd);

        range.setFrom(oneRangeBegin);
        range.setTo(oneRangeEnd);

        oneRangeBegin = range.getFrom() - 1;
        oneRangeEnd = range.getTo() - 1;

        range.setFrom(oneRangeBegin);
        range.setTo(oneRangeEnd);

        double twoRangeBegin = 4;
        double twoRangeEnd = 5;

        Range range2 = new Range(twoRangeBegin, twoRangeEnd);

        range2.setFrom(twoRangeBegin);
        range2.setTo(twoRangeEnd);

        twoRangeBegin = range2.getFrom() + 1;
        twoRangeEnd = range2.getTo() + 1;

        range2.setFrom(twoRangeBegin);
        range2.setTo(twoRangeEnd);

        double number = 5.14;

        if (range.isInside(number) && range2.isInside(number)) {
            System.out.println("Число " + number + " принадлежит каждому интервалу.");
        } else  if (range.isInside(number)) {
            System.out.println("Число " + number + " принадлежит первому интервалу.");
        } else if (range2.isInside(number)) {
            System.out.println("Число " + number + " принадлежит второму интервалу.");
        } else {
            System.out.println("Число " + number + " не принадлежит интервалам.");
        }

        System.out.println("Длина первого интервала = " + range.getLength());

        Range rangesIntersection = range.getIntersection(range2);

        if (rangesIntersection == null) {
            System.out.println("Интервалы не пересекаются.");
        } else {
            System.out.println("Интервалы пересекаются в диапазоне от " + rangesIntersection.getFrom()
                    + " до " + rangesIntersection.getTo());
        }

        Range[] rangesUnion = range.getUnion(range2);

        System.out.print("Объединение двух интервалов раполагается в диапозоне");
        for (Range ranges : rangesUnion) {
            System.out.print(" от " + ranges.getFrom() + " до " + ranges.getTo());
        }
        System.out.println();

        Range[] rangesComplement = range.getComplement(range2);

        if (rangesComplement == null) {
            System.out.println("Разность интервалов равна пустому множеству");
        } else {
            System.out.print("Разность двух интервалов раполагается в диапозоне");
            for (Range ranges : rangesComplement) {
                System.out.print(" от " + ranges.getFrom()
                        + " до " + ranges.getTo());
            }
        }
    }
}
