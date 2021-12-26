package com.Part1.FileHandling;


import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

        File myObj = new File("F:\\The java\\src\\main\\java\\com\\Part1\\FileHandling\\ File1.txt");
        if(myObj.exists()){
            System.out.println("File Name:"+myObj.getName());
            System.out.println("Absolute path:"+myObj.getAbsolutePath());
            System.out.println("Writeable: "+myObj.canWrite());
            System.out.println("Readable: "+myObj.canRead());
            System.out.println("File size in bytes "+myObj.length());
        }
        else {
            System.out.println("The file does not exits");
        }

    }
}
