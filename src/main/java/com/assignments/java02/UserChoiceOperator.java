package com.assignments.java02;

// Take in two numbers and an operator (+, - , *, / )
// and calculate the value. (Use if conditions)

import java.util.Scanner;

public class UserChoiceOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op;
        int a, b;
        System.out.println("Enter two numbers:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Enter operator +, -, *, /");
        op = input.next();

        if(op.equals("+")) System.out.println("Addition is:"+(a+b));
        if(op.equals("-")) System.out.println("Substraction is:"+(a-b));
        if(op.equals("*")) System.out.println("Multiplication is:"+(a*b));
        if(op.equals("/")) System.out.println("Division is:"+(a/b));


    }
}
