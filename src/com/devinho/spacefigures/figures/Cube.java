package com.devinho.spacefigures.figures;

import com.devinho.spacefigures.util.Figure;

import java.util.Date;

public class Cube extends Figure {

    private double sideLength;

    public Cube(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Can't provide negative value");
        }
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return 8 * (sideLength * sideLength);
    }

    @Override
    public double volume() {
        return sideLength * sideLength * sideLength;
    }

    @Override
    public String savableString() {
        return "CUBE/side=" + this.sideLength + "/area=" + this.area() + "/volume=" + this.volume() + "/date=" + new Date();
    }

    @Override
    public String toString() {
        return "Side length = " + this.sideLength + "\nArea = " + this.area() + "\nVolume = " + this.volume();
    }
}
