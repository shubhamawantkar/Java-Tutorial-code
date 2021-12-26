package com.Part1.IOStreams;


// BufferedReader
//Scanner

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserInput {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int n = Integer.parseInt(br.readLine());

        System.out.println(n);

    }

}
