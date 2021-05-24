package com.devinho.spacefigures.figures;

import com.devinho.spacefigures.util.Figure;

import java.util.Date;

public class Cylinder extends Figure {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("Can't provide negative value");
        }
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * this.radius * this.radius);
    }

    @Override
    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public String savableString() {
        return "CYLINDER/radius=" + this.radius + "/height=" + this.height + "/area=" + this.area() + "/volume=" + this.volume() + "/date=" + new Date();
    }

    @Override
    public String toString() {
        return "Radius = " + this.radius + "\nHeight = " + this.height + "\nArea = " + this.area() + "\nVolume = " + this.volume();
    }
}
