package com.Part1.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("F:\\The java\\src\\main\\java\\com\\Part1\\FileHandling\\ File1.txt");
        fileWriter.write("Java is the prominent programming langueage of the millenium");
        fileWriter.close();
        System.out.println("Successfully wrote to the file.");
    }
}
