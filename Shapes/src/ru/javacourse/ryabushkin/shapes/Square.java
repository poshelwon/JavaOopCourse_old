package ru.javacourse.ryabushkin.shapes;

import java.util.Objects;

public class Square implements Shape {
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public boolean equels(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Square guest = (Square) obj;
        return Double.compare(sideLength, guest.sideLength) == 0;
    }

    public int hashCode() {
        return Objects.hashCode(sideLength);
    }

    public String toString() {
        return "shape = " + getName() + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", width = " +
                getWidth() + ", height = " + getHeight();
    }

    public String getName() {
        return "square";
    }

    public double getWidth() {
        return this.sideLength;
    }

    public double getHeight() {
        return this.sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        final int sideCount = 4;
        return sideLength * sideCount;
    }
}