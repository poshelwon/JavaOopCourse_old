package ru.javacourse.ryabushkin.shapes;

public class Square implements Shape {
    private double sideLength;
    static final int sidesCount = 4;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Square square = (Square) obj;
        return sideLength == square.sideLength;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;

        return prime * hash + Double.hashCode(sideLength);
    }

    @Override
    public String toString() {
        return "sideLength = " + sideLength + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }

    public String getName() {
        return "square";
    }

    public double getWidth() {
        return sideLength;
    }

    public double getHeight() {
        return sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return sideLength * sidesCount;
    }
}