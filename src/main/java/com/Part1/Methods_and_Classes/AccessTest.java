package com.Part1.Methods_and_Classes;

/*
This program demonstrates the difference between public and private
 */
class Acc{
    int a; // default access
    public int b;  // public access
    private int c;  // private access

    // methods to access c
    void setc(int i){
        c = i; // set c's value
    }

    int getc(){
        return c; // get's c value
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Acc ob = new Acc();

        // These are ok, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // this is not ok and will cause an error
      //  ob.c = 100;  //error

        // You must access c through its methods
        ob.setc(100); //ok
        System.out.println("a, b and c: "+ob.a+" "+ob.b+" "+ob.getc());

    }
}
