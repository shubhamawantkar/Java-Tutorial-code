package com.assignments.java02;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {


    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fib(n));
    }
}
