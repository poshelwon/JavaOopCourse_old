package ru.javacourse.ryabushkin.range_main;

import ru.javacourse.ryabushkin.range.Range;

public class Main {
    public static void main(String[] args) {
        double oneRangeBegin = 0;
        double oneRangeEnd = 5.15;

        Range range = new Range(oneRangeBegin, oneRangeEnd);

        range.setFrom(oneRangeBegin);
        range.setTo(oneRangeEnd);

        oneRangeBegin = range.getFrom() - 0.01;
        oneRangeEnd = range.getTo() - 0.01;

        range.setFrom(oneRangeBegin);
        range.setTo(oneRangeEnd);


        double twoRangeBegin = 5.12;
        double twoRangeEnd = 7.1;

        Range range2 = new Range(twoRangeBegin, twoRangeEnd);

        range2.setFrom(twoRangeBegin);
        range2.setTo(twoRangeEnd);
        
        twoRangeBegin = range2.getFrom() + 0.01;
        twoRangeEnd = range2.getTo() + 0.01;

        range2.setFrom(twoRangeBegin);
        range2.setTo(twoRangeEnd);

        double number = 5.14;

        if (range.isInside(number) && range2.isInside(number)) {
            System.out.println("Число принадлежит каждому диапазону.");
        } else  if (range.isInside(number)) {
            System.out.println("Число принадлежит первому диапазону.");
        } else if (range2.isInside(number)) {
            System.out.println("Число принадлежит второму диапазону.");
        } else {
            System.out.println("Число не принадлежит диапазонам.");
        }
    }
}
