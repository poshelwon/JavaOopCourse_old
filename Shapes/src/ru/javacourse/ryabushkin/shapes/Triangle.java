package ru.javacourse.ryabushkin.shapes;

import java.util.Objects;

public class Triangle implements Shape {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public boolean equels(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangle guest = (Triangle) obj;
        return Double.compare(x1, guest.x1) == 0 && Double.compare(y1, guest.y1) == 0 &&
                Double.compare(x2, guest.x2) == 0 && Double.compare(y2, guest.y2) == 0 &&
                Double.compare(x3, guest.x3) == 0 && Double.compare(y3, guest.y3) == 0;
    }

    public int hashCode() {
        return Objects.hashCode(x1) + Objects.hashCode(x2) + Objects.hashCode(x3) +
                Objects.hashCode(y1) + Objects.hashCode(y2) + Objects.hashCode(y3);
    }

    public String toString() {
        return "shape = " + getName() + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", width = " +
                getWidth() + ", height = " + getHeight();
    }

    public String getName() {
        return "triangle";
    }

    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    public double getArea() {
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }

    public double getPerimeter() {
        // √((X₂-X₁)² + (Y₂-Y₁)²) + √(( X₃-X₂)² + (Y₃-Y₂)²) + √((X₃-X₁)² + (Y₃-Y₁)²).

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))
                + Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }
}