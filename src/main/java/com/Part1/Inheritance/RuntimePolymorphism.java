package com.Part1.Inheritance;

class Parent{
    void callme(){
        System.out.println("Inside Parent's callme method");
    }
}

class Child extends Parent{
    // override callme()
    void callme(){
        System.out.println("Inside Child's callme method");
    }
}

class Base extends Child{
    // override callme()
    void callme(){
        System.out.println("inside Base's callme method");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Base base = new Base();

        Parent p;  // obtain a reference of type parent

        p = parent;  // p refers to a parent object
        p.callme();  // calls parent version of callme

        p = child;  // p refers to child object
        p.callme();  // calls child version of callme

        p = base;  // p refers to base object
        p.callme(); // calls base version of callme
    }
}
