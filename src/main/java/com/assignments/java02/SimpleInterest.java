package com.assignments.java02;

// Write a program to input principal, time and rate (P, T, R)
// from the user and find Simple Interest

import java.util.Scanner;

// formula for simple interest is
// final amount = principal (1 + rate*time)
public class SimpleInterest {

    static double Interest(double p, double t, double r){

        double principal = p, time = t, rate = r;
        double simpleInterest;
        simpleInterest = (principal*time*rate)/100;

        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, t, r;
        System.out.print("Enter Initial Principal:");
        p = input.nextDouble();
        System.out.println("Enter total time:");
        t = input.nextDouble();
        System.out.println("Enter rate:");
        r = input.nextDouble();

        double fa = Interest(p, t, r)+p;
        System.out.println("Your final amount is:"+fa);
    }
}
