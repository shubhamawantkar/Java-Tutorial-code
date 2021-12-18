package com.shubham.Methods_and_Classes;

// Demonstrate an inner class.

public class Outer {
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    void test2(){
        for(int i=0;i<10;i++){
            class Inner{
                void display(){
                    System.out.println("Display: outer_x "+outer_x);
                }
            }
            Outer.Inner inner = new Outer.Inner();
            inner.display();
        }

    }
    // this is an inner class
    class Inner{
        void display(){
            System.out.println("Display: outer_x "+outer_x);
        }
    }
}

class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        outer.test2();

    }
}
