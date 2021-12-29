package com.assignments.java01;

// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to print table:");
        int number = input.nextInt();


        System.out.println("Table of "+number);
        for(int i=1;i<=10;i++){
            System.out.println(number*i);
        }
    }

}
