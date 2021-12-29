package com.assignments.java01;

//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        boolean leapyear = false;
        leapyear = checkLeapOrNot(year);
        if(leapyear == true){
            System.out.println(year +" is leap year");
        }else {
            System.out.println(year +" is not leap year");
        }

    }

    static boolean checkLeapOrNot(int year) {
        if (year % 400 == 0) {
            return true;
        }else if (year % 4 == 0) {
            return true;
        } else if(year % 100 == 0) {
            return false;
        }
        return false;
    }
}
