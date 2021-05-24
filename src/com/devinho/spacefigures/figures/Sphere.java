package com.devinho.spacefigures.figures;

import com.devinho.spacefigures.util.Figure;

import java.util.Date;

public class Sphere extends Figure {

    private double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Can't provide negative value");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * this.radius * this.radius;
    }

    @Override
    public double volume() {
        return this.area() * this.radius / 3;
    }

    @Override
    public String savableString() {
        return "SPHERE/radius=" + this.radius + "/area=" + this.area() + "/volume=" + this.volume() + "/date=" + new Date();
    }

    @Override
    public String toString() {
        return "Radius = " + this.radius + "\nArea = " + this.area() + "\nVolume = " + this.volume();
    }
}
