package com.devinho.spacefigures;

import com.devinho.spacefigures.figures.Cube;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printWelcomeText();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                System.out.println("*** Goodbye ***");
                break;
            }

            switch (input) {
                case "c":
                    System.out.println("You have chosen CUBE. Enter a side length");
                    double sideLength = scanner.nextDouble();
                    scanner.nextLine();
                    Cube cube = new Cube(sideLength);
                    System.out.println(cube);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
        scanner.close();
    }

    public static void printWelcomeText() {
        System.out.println();
        System.out.println("*** Welcome in SpaceFigures ***");
        System.out.println();
        System.out.println("Here You can create your own figures and quickly calculate it's area and volume");
        System.out.println("Type a letter to create:");
        System.out.println("c - CUBE");
        System.out.println();
        System.out.println("If You want to exit, type x.");
    }
}
