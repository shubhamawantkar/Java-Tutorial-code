package com.Part1.Generics;

public class Test1 {
    public static void main(String[] args) {
        ClassTest<Integer> obj = new ClassTest<Integer>(10);
        int x = obj.getValue();
        System.out.println(x);

        ClassTest<String> obj1 = new ClassTest<String>("Shubham");
        String s = obj1.getValue();
        System.out.println(s);

        ClassTest<Double> obj2 = new ClassTest<Double>(100.10000);
        double d = obj2.getValue();
        System.out.println(d);
/*
        ClassTest<A> ct = new ClassTest<A>( new A());
        A obj = ct.getValue();
        obj.m1();*/
    }
}
