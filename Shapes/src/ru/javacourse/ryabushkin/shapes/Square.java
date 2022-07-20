package ru.javacourse.ryabushkin.shapes;

public class Square implements Shape {
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public String getName() {
        return new String("square");
    }
    public double getWidth(){
        return this.sideLength;
    }

    public double getHeight(){
        return this.sideLength;
    }

    public double getArea(){
        return sideLength * sideLength;
    }

    public double getPerimeter(){
        final int sideCount = 4;
        return sideLength * sideCount;
    }
}