package com.Part1.Inheritance;

// Method overrriding.

class A1{
    int i,j;
    A1(int a, int b){
      i = a;
      j = b;
    }

    // display i and j
    void show(){
        System.out.println("i and j: "+i+" "+j);
    }
}

class B1 extends A1{
    int k;
    B1(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // display k -  this overrrides show() in A1
    void show(){
        super.show();
        System.out.println("k: "+k);
    }
}
public class Override {
    public static void main(String[] args) {
        B1 b1 = new B1(1,2,3);

        b1.show();  // this calls show() in b1
    }
}
