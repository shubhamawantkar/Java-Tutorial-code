package com.Part1.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add("c");
        list.add("c++");
        list.add("java");
        list.add("VB.net");
        list.add("Python");
        list.add("JavaScript");

        // get list elements
        System.out.println(list.get(0));
        System.out.println(list.getLast());

        // update list elements
        list.set(0,"C");
        list.set(1,"C++");
        list.set(2,"JAVA");
        System.out.println("List after updating: "+ list);

        // remove element from list

        list.remove(list.getLast());
        System.out.println(list);

        // iterate over a list

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            Object o  = itr.next();
            System.out.println(o);
            if(o.equals("Python")){
                System.out.println("Python is also in list");
            }
        }

        System.out.println(list.removeAll(list));
        System.out.println(list);
    }
}
