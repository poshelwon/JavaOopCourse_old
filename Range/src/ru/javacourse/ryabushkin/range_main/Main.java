package ru.javacourse.ryabushkin.range_main;

import ru.javacourse.ryabushkin.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение диапозона: ");
        double from = scanner.nextDouble();

        System.out.print("Введите конечное значение диапозона: ");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);

        from = range.getFrom(from) - 1;
        to = range.getTo(to) - 1;

        range.setFrom(from);
        range.setTo(to);

        System.out.println("Длина обработанного диапазона чисел = " + range.getLength());

        System.out.print("Введите число, которое следует проверить на принадлежность диапазону: ");
        double number = scanner.nextDouble();

        if (range.isInside(number)) {
            System.out.println("Число принадлежит к заданному диапазону.");
        } else {
            System.out.println("Число не принадлежит к заданному диапазону.");
        }
    }
}
