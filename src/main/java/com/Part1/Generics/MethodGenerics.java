package com.Part1.Generics;

import java.util.ArrayList;

public class MethodGenerics {

    static void m1(ArrayList<? extends  Number> al){
        System.out.println("al "+al);
    }

    public static void main(String[] args) {
        /*ArrayList<Double> al1 =new ArrayList<Double>();
        al1.add(10.00);
        al1.add(20.00);
        al1.add(30.00);
        al1.add(40.00);
        m1(al1);*/

        ArrayList<Integer> al1 =new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        m1(al1);
    }
}
