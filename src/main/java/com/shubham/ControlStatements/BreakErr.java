package com.shubham.ControlStatements;


// This program contains an error.

public class BreakErr {
    public static void main(String[] args) {
        one: for(int i=0;i<3;i++){
            System.out.println("pass "+i+" ");
        }

        for(int j=0;j<100;j++){
           // if(j==10) break one; //Wrong
        }
    }
}

