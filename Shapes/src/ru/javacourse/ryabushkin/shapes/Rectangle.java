package ru.javacourse.ryabushkin.shapes;

public class Rectangle implements Shape {
    private final double sideLength1;
    private final double sideLength2;

    public Rectangle (double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public String getName() {
        return new String("rectangle");
    }

    public double getWidth() {
        return sideLength1;
    }

    public double getHeight() {
        return sideLength2;
    }

    public double getArea() {
        return sideLength1 * sideLength2;
    }

    public double getPerimeter() {
        return (sideLength1 + sideLength2) * 2;
    }
}