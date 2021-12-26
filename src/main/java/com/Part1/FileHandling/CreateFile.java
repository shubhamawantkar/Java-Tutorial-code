package com.Part1.FileHandling;


import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File myobj = new File("F:\\The java\\src\\main\\java\\com\\Part1\\FileHandling\\ File1.txt");
        if(myobj.createNewFile()){
            System.out.println("File Created: "+myobj.getName());
        }
        else {
            System.out.println("File already exists.");
        }
    }
}
