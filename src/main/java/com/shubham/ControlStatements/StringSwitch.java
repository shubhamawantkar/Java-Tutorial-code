package com.shubham.ControlStatements;

public class StringSwitch{
    public static void main(String[] args) {
        String str = "two";
        switch (str){
            case "one":
                System.out.println("One");
                break;
            case "two":
                System.out.println("Two");
                break;
            case "three":
                System.out.println("Three");
                break;
            case "four":
                System.out.println("Four");
                break;
            case "five":
                System.out.println("Five");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }
    }
}
