package com.assignments.java02;

// Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check even or odd:");
        int n = input.nextInt();
        boolean result = evenOrOdd(n);
        if(result==true){
            System.out.println(n+" is even");
        }else {
            System.out.println(n+" is odd");
        }
    }

    static boolean evenOrOdd(int num){
        if(num%2==0){
            return true;
        return false;
    }
}
