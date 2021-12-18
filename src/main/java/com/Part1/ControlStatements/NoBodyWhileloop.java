package com.Part1.ControlStatements;

//The target of loop can be empty

public class NoBodyWhileloop {
    public static void main(String[] args) {
        int i,j;

        i =100;
        j=200;

        //find midpoint between i and j
        while (++i < --j);  // no body in this loop

        System.out.println("Midpoint is "+i);
    }
}
