package ru.javacourse.ryabushkin.shapes;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return new String("circle");
    }

    public double getWidth() {
        return this.radius * 2;
    }

    public double getHeight() {
        return this.radius * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
