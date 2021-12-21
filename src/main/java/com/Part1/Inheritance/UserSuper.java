package com.Part1.Inheritance;

// using super to overcome name hiding.
class C{
    int i;
}

// create a sublclass by extending class C.

class D extends C{
    int i; // this i hides the i in C.

    D(int a, int b){
        super.i = a;  // i in C
        i = b;  // i in B
    }

    void show(){
        System.out.println("i in superclass "+super.i);
        System.out.println(("i in subclass "+ i));
    }
}

public class UserSuper {
    public static void main(String[] args) {
        D d = new D(1,2);
        d.show();
    }
}
