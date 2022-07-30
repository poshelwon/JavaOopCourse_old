package ru.javacourse.ryabushkin.vector;

public class Vector {

    private double[] vector;

    public Vector (int dimension) { //+
        if (dimension <= 0) {
            throw new IllegalArgumentException("dimension <= 0");
        }

        vector = new double[dimension];
    }

    public Vector (Vector vector) { //+
        this.vector = new double[vector.vector.length];

        for (int i = 0, j = 0; i < vector.vector.length; i++, j++) {
            this.vector[i] = vector.vector[i];
        }
    }

    public Vector (double[] vector) { //+
        this.vector = new double[vector.length];

        System.arraycopy(vector, 0, this.vector, 0, vector.length);
    }

    public Vector (int dimension, double[] vector) { //+
        int length = (Math.max(dimension, vector.length));
        this.vector = new double[length];

        for (int i = 0, j = 0; i < Math.min(dimension, vector.length); i++, j++) {
                this.vector[i] = vector[i];
        }
    }

    public double[] getVector() {
        System.arraycopy(vector, 0, this.vector, 0, vector.length);
        return vector;
    }

    public void setVector (double[] vector) {
        System.arraycopy(vector, 0, this.vector, 0, vector.length);
    }

    public int getSize() {
        return vector.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(("{"));

        for (double i : vector) {
            stringBuilder.append(i).append(", ");
        }

        stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 2));
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    public Vector VectorsSum(Vector vector) {
        int vectorMaxLength = Math.max(this.getSize(), vector.getSize());

        Vector resultVector = new Vector(vectorMaxLength);

        for (int i = 0; i < vectorMaxLength; i++) {
            resultVector.vector[i] = ((i < this.getSize()) ? this.vector[i] : 0)
                    + ((i < vector.getSize()) ? vector.vector[i] : 0);
        }

        return resultVector;
    }

    public Vector VectorsDifference(Vector vector) {
        int vectorMaxLength = Math.max(this.getSize(), vector.getSize());

        Vector resultVector = new Vector(vectorMaxLength);

        for (int i = 0; i < vectorMaxLength; i++) {
            resultVector.vector[i] = ((i < this.getSize()) ? this.vector[i] : 0)
                    - ((i < vector.getSize()) ? vector.vector[i] : 0);
        }

        return resultVector;
    }

    public Vector vectorMultiplicationScalar(int scalar) {
        Vector resultVector = new Vector(vector);

        for (int i = 0; i < resultVector.getSize(); i++) {
            resultVector.vector[i] = resultVector.vector[i] * scalar;
        }

        return resultVector;
    }

    public Vector vectorReversal() {
        Vector resultVector = new Vector(vector);

        for (int i = 0; i < resultVector.getSize(); i++) {
            resultVector.vector[i] = resultVector.vector[i] * -1;
        }

        return resultVector;
    }

    public double vectorLength() {
        int vectorLength = 0;
        Vector resultVector = new Vector(vector);

        for (int i = 0; i < resultVector.getSize(); i++) {
            resultVector.vector[i] = resultVector.vector[i] * resultVector.vector[i];
        }

        for (int i = 0; i < resultVector.getSize(); i++) {
            vectorLength += Math.abs(Math.sqrt(resultVector.vector[i]));
        }

        return vectorLength;
    }
}