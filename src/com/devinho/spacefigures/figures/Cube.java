package com.devinho.spacefigures.figures;

public class Cube {

    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return 8 * (sideLength * sideLength);
    }

    public double volume() {
        return sideLength * sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "The cube has side length of " + this.sideLength + ", area " + this.area() + ", volume " + this.volume();
    }
}
