package com.assignments.java02;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2;
        int largest;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is largest number");
        }else {
            System.out.println(num2+" is largest number");
        }
    }
}
