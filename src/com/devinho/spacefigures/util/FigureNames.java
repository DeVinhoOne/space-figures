package com.devinho.spacefigures.util;

public enum FigureNames {
    CUBE("\nYou have chosen a CUBE. Enter a side length"),
    SPHERE("\nYou have chosen a SPHERE. Enter a radius"),
    CONE("\nYou have chosen a CONE. Enter a radius and a height"),
    CYLINDER("\nYou have chosen a CYLINDER. Enter a radius and a height");

    private String description;

    FigureNames(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
