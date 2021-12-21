package com.Part1.Collections;


import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        for(int i=0;i<10;i++){
            s1.add(i);
        }
        System.out.println(s1);

        System.out.println(s1.pop());
        s1.push(Integer.valueOf("10"));
        System.out.println(s1);
        s1.removeElementAt(9);
        System.out.println(s1);
    }
}
