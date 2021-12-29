package com.assignments.java01;
import java.util.Scanner;


// Take two numbers and print the sum of both.

class Addition{
    int add(int num1,int num2){
        return (num1+num2);
    }
}
public class sumoftwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number:");
        num1 = input.nextInt();
        System.out.print("Enter second number:");
        num2 = input.nextInt();

        Addition ad = new Addition();
        int result = ad.add(num1,num2);
        System.out.println("Addition of "+num1+ " and "+num2+" is "+ result);

    }
}
