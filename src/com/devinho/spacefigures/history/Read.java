package com.devinho.spacefigures.history;

import java.nio.file.Paths;
import java.util.Scanner;

public class Read {

    private Scanner scanner;

    public Read() {
        try {
            this.scanner = new Scanner(Paths.get("history.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printHistory() {
        System.out.println("Space figures which You have created:");
        while (this.scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            System.out.println(line);
        }
    }
}
