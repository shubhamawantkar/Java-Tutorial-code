package com.assignments.java02;

// input currency in rupees and output in USD.

import java.util.Scanner;

public class RsToUSD {
    public static void main(String[] args) {
        float rsAmount, USD;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount Rs:");
        rsAmount = input.nextFloat();

        USD = (float) (rsAmount/74.58);

        System.out.println("Your amount in USD is:"+USD);


    }
}
