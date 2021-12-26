package com.Part1.WrapperClass;


public class Boxing {
    public static void main(String[] args) {
        // Boxing process using Constructors

        Integer obj1 = new Integer(123);
        Integer obj2 = new Integer("124");


        // Boxing process using valueOf() method
        Integer obj3 = Integer.valueOf(125);
        Integer obj4 = Integer.valueOf("126");

        System.out.println("----After Boxing process----");
        System.out.println("obj1="+obj1);
        System.out.println("obj2="+obj2);
        System.out.println("obj3="+obj3);
        System.out.println("obj4="+obj4);
    }
}
