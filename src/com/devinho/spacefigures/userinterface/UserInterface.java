package com.devinho.spacefigures.userinterface;

import com.devinho.spacefigures.figures.Cube;

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

            switch (input) {
                case "c":
                    System.out.println("\nYou have chosen CUBE. Enter a side length");
                    System.out.print(">>> ");
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
    }

    private void printWelcomeText() {
        System.out.println();
        System.out.println("*** Welcome in Space Figures ***");
        System.out.println();
        System.out.println("Here You can create your own figures and quickly calculate it's area and volume");
    }

    private void printInstructions() {
        System.out.print("--------------------------------");
        System.out.println("\nType a letter to create:");
        System.out.println("\tc - CUBE");
        System.out.println();
        System.out.println("If You want to exit, type x.");
        System.out.println("--------------------------------");
    }
}
