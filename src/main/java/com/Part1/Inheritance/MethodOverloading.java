package com.Part1.Inheritance;

// Methods with differing type signatures are overloaded - not overriden.

class Super{
    int i, j;
    Super(int a, int b){
        i = a;
        j = b;
    }

    // Display i and j
    void show(){
        System.out.println("i and j: "+i+" "+j);
    }
}

// create a subclass by extending class Super

class Subclass extends Super{
    int k;

    Subclass(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // overload show()
    void show(String msg){
        System.out.println(msg + k);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Subclass subclass = new Subclass(1,2,3);
        subclass.show("This is k:");  // this calls show() in Subclass
        subclass.show();  // this calls show() in Superclass


    }
}
