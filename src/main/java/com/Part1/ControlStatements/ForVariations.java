package com.Part1.ControlStatements;

// Parts of the for loop can be empty.

public class ForVariations {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for(;!done;){
            System.out.println("i is "+i);
            if(i==10) done=true;
            i++;
        }
    }
}
