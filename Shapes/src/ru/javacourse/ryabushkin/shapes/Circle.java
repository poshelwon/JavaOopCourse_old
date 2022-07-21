package ru.javacourse.ryabushkin.shapes;

import java.util.Objects;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public boolean equels(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Circle guest = (Circle) obj;
        return Double.compare(radius, guest.radius) == 0;
    }

    public int hashCode() {
        return Objects.hashCode(radius);
    }

    public String toString() {
        return "shape = " + getName() + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", width = " +
                getWidth() + ", height = " + getHeight();
    }

    public String getName() {
        return "circle";
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