package com.devinho.spacefigures.figures;

public class RightCircularCone {

    private double radius;
    private double height;

    public RightCircularCone(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("Can't provide negative value");
        }
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return (Math.PI * this.radius) * (this.radius + Math.sqrt((this.height * this.height) + (this.radius * this.radius)));
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * (this.height / 3);
    }

    @Override
    public String toString() {
        return "Radius = " + this.radius + "\nHeight = " + this.height + "\nArea = " + this.area() + "\nVolume = " + this.volume();
    }
}
