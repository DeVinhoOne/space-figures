package com.devinho.spacefigures.figures;

public class Sphere {

    private double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double area() {
        return 4 * Math.PI * this.radius * this.radius;
    }

    public double volume() {
        return this.area() * this.radius / 3;
    }

    public String toString() {
        return "Radius = " + this.radius + "\nArea = " + this.area() + "\nVolume = " + this.volume();
    }
}
