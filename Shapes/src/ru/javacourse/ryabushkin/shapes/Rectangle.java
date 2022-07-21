package ru.javacourse.ryabushkin.shapes;

import java.util.Objects;

public class Rectangle implements Shape {
    private final double sideLength1;
    private final double sideLength2;

    public Rectangle(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public boolean equels(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Rectangle guest = (Rectangle) obj;
        return Double.compare(sideLength1, guest.sideLength1) == 0 && Double.compare(sideLength2, guest.sideLength2) == 0;
    }

    public int hashCode() {
        return Objects.hashCode(sideLength1) + Objects.hash(sideLength2);
    }

    public String toString() {
        return "shape = " + getName() + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", width = " +
                getWidth() + ", height = " + getHeight();
    }

    public String getName() {
        return "rectangle";
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