package com.devinho.spacefigures.util;

public enum FigureNames {
    CUBE("\nYou have chosen a CUBE. Enter a side length"),
    SPHERE("\nYou have chosen a SPHERE. Enter a radius"),
    CONE("\nYou have chosen a RIGHT CIRCULAR CONE. Enter a radius and a height"),
    RIGHT_CYLINDER("\nYou have chosen a RIGHT CYLINDER. Enter a radius and a height");

    private String figureInformation;

    FigureNames(String figureInformation) {
        this.figureInformation = figureInformation;
    }

    public String getFigureInformation() {
        return figureInformation;
    }
}
