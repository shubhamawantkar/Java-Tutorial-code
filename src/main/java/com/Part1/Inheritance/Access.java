package com.Part1.Inheritance;

/*
In a class hierarchy, private members remain
private to their class.

this program contains an error and will not compile.

 */
class Aa{
    int i;  //default access
    private int j; // private to A

    void setij(int x, int y){
        i = x;
        j = y;
    }

}

// Aa's j is not accessible here.
class  Bb extends Aa{
    int total;

    void sum(){
    //    total = i+j; //ERROR, j is not accessible here
    }
}

public class Access {
    public static void main(String[] args) {
        Bb bb = new Bb();
        bb.setij(10,20);
        bb.sum();
        System.out.println("Total is "+bb.total);

    }
}
