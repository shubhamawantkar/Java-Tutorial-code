package com.shubham.ControlStatements;

// Using break as a civilized form of goto.

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:{
            second:{
                third:{
                    System.out.println("brefore the break");
                    if(t) break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
