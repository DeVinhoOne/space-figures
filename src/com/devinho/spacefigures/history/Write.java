package com.devinho.spacefigures.history;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    private FileWriter fw;

    public void append(String text) {
        File file = new File("history.txt");
        try {
            this.fw = new FileWriter(file, true);
            this.fw.append(text + "\n");
            this.fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
