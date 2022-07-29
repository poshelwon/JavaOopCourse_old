package ru.javacourse.ryabushkin.vector_main;

import ru.javacourse.ryabushkin.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5);

        double[] vector1Array = {1, 2, 3, 4, 5};

        vector1.setVector(vector1Array);

        Vector vector2 = new Vector(3);

        double[] vector2Array = {1, 2, 3};

        vector2.setVector(vector2Array);

        System.out.println(vector1.addVector(vector2));
    }
}