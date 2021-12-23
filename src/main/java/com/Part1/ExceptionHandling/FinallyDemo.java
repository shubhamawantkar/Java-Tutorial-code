package com.Part1.ExceptionHandling;

// Demonstrate finally
public class FinallyDemo {
    // Throw an exception out of the method.
    static void procA(){
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    // return from within a try block.

    static void procB(){
        try{
            System.out.println("Inside procB");
            return;
        }finally {
            System.out.println("proc'B finally");
        }
    }

    // execute a try block normally.
    static void procC(){
        try {
            System.out.println("inside procC");
        }finally {
            System.out.println("Proc'C finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Exception caught");
        }

        procB();
        procC();
    }

}
