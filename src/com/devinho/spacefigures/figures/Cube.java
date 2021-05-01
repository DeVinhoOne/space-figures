package com.devinho.spacefigures.figures;

public class Cube {

    private double sideLength;

    public Cube(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Can't provide negative value");
        }
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
        return "Side length = " + this.sideLength + "\nArea = " + this.area() + "\nVolume = " + this.volume();
    }
}
