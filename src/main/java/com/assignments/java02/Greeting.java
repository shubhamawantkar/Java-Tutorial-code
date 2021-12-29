package com.assignments.java02;

// Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        name = input.next();
        System.out.println("Hello "+name);
    }
}
