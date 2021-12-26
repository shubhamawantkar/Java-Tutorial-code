package com.Part1.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        File myObj = new File("F:\\The java\\src\\main\\java\\com\\Part1\\FileHandling\\ File1.txt");
        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }
}
