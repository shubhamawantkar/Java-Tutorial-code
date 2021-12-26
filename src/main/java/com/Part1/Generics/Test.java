package com.Part1.Generics;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
       // a1.add("ram");

        Iterator i = a1.iterator();
        while (i.hasNext()){
            Integer ii = (Integer) i.next();  // ClassCastException
            System.out.println(ii);
        }
    }
}
