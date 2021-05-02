package com.devinho.spacefigures.userinterface;

import com.devinho.spacefigures.figures.Cube;
import com.devinho.spacefigures.figures.RightCylinder;
import com.devinho.spacefigures.figures.Sphere;
import com.devinho.spacefigures.figures.RightCircularCone;
import com.devinho.spacefigures.util.FigureNames;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        this.printWelcomeText();

        while (true) {
            this.printInstructions();
            System.out.print(">>> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                System.out.println("*** Goodbye ***");
                break;
            }
            FigureNames figureName = FigureNames.valueOf(input.toUpperCase());

            switch (figureName) {
                case CUBE:
                    System.out.println(figureName.getFigureInformation());
                    System.out.print(">>> ");
                    double sideLength = scanner.nextDouble();
                    scanner.nextLine();
                    Cube cube = new Cube(sideLength);
                    System.out.println(cube);
                    break;
                case SPHERE:
                    System.out.println(figureName.getFigureInformation());
                    System.out.print(">>> ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    Sphere sphere = new Sphere(radius);
                    System.out.println(sphere);
                    break;
                case CONE:
                    System.out.println(figureName.getFigureInformation());
                    System.out.print(">>> ");
                    double rccRadius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print(">>> ");
                    double rccHeight = scanner.nextDouble();
                    scanner.nextLine();
                    RightCircularCone rightCircularCone = new RightCircularCone(rccRadius, rccHeight);
                    System.out.println(rightCircularCone);
                    break;
                case RIGHT_CYLINDER:
                    System.out.println(figureName.getFigureInformation());
                    System.out.print(">>> ");
                    double rcRadius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print(">>> ");
                    double rcHeight = scanner.nextDouble();
                    scanner.nextLine();
                    RightCylinder rightCylinder = new RightCylinder(rcRadius, rcHeight);
                    System.out.println(rightCylinder);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    private void printWelcomeText() {
        System.out.println();
        System.out.println("*** Welcome in Space Figures ***");
        System.out.println();
        System.out.println("Here You can create your own figures and quickly calculate it's area and volume");
    }

    private void printInstructions() {
        System.out.print("--------------------------------");
        System.out.println("\nEnter a figure name You want:");
        System.out.println("\tcube");
        System.out.println("\tsphere");
        System.out.println("\tcone");
        System.out.println("\tright_cylinder");
        System.out.println();
        System.out.println("If You want to exit, type x.");
        System.out.println("--------------------------------");
    }
}
