package com.assignments.java01;

import java.util.Scanner;

// keep taking numbers as inputs till the user enters 'x',
// after that print sum of all.
public class SumOfAll {

    public static void main(String[] args) {
        int sum = 0, number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'x' to continue\nenter other than 'x' to exit\n");
        String x = input.next();
        while (x.equals("x")){
            System.out.println("Enter number:");
            number = input.nextInt();
            sum +=number;
            System.out.println("Enter 'x' to continue\nenter other than 'x' to exit\n");

            x = input.next();
        }

        System.out.println("Sum of all numbers: "+sum);

    }
}
