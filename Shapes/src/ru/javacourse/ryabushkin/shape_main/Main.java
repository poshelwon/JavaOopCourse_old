package ru.javacourse.ryabushkin.shape_main;

import ru.javacourse.ryabushkin.shapes.*;

import java.util.Arrays;
import java.util.Comparator;

class AreaSortShapesArray implements Comparator<Shape> {
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getArea(), shape2.getArea());
    }
}

class PerimeterSortShapesArray implements Comparator<Shape> {
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getPerimeter(), shape2.getPerimeter());
    }
}

public class Main {
    static Shape getMaxAreaShape(Shape[] shapes) {
        Arrays.sort(shapes, new AreaSortShapesArray());

        return shapes[shapes.length - 1];
    }

    static Shape getPreMaxPerimeterShape(Shape[] shapes) {
        Arrays.sort(shapes, new PerimeterSortShapesArray());

        return shapes[shapes.length - 2];
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        Shape square0 = new Square(9);
        shapes[0] = square0;

        Shape rectangle1 = new Rectangle(1, 2);
        shapes[1] = rectangle1;

        Shape circle2 = new Circle(1);
        shapes[2] = circle2;

        Shape square3 = new Square(1.5);
        shapes[3] = square3;

        Shape triangle4 = new Triangle(-1, 1, 0, 2, 4, 1);
        shapes[4] = triangle4;

        Shape rectangle5 = new Rectangle(1.5, 2);
        shapes[5] = rectangle5;

        Shape circle6 = new Circle(0.5);
        shapes[6] = circle6;

        Shape triangle7 = new Triangle(0, 0, 5, 5, -5, 5);
        shapes[7] = triangle7;

        Shape square8 = new Square(2.5);
        shapes[8] = square8;

        Shape rectangle9 = new Rectangle(0.5, 3);
        shapes[9] = rectangle9;

        Shape maxAreaShape = getMaxAreaShape(shapes);

        System.out.println("Max area " + maxAreaShape.toString());

        Shape preMaxPerimeterShape = getPreMaxPerimeterShape(shapes);

        System.out.println("Pre-max perimeter " + preMaxPerimeterShape.toString());
    }
}