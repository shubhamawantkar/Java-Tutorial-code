package com.assignments.java02;

import java.util.Scanner;
// to find armstrong number between two given number

/*
153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153*/
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0, temp, r;
        temp = num;
        while (num>0){
            r = num%10;
            sum+= (r*r*r);
            num=num/10;
        }
        if(temp == sum){
            System.out.println("armstrong number");
        }else {
            System.out.println("not armstrong number");
        }
    }
}
