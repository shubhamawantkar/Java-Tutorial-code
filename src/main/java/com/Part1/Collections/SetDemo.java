package com.Part1.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

      //  HashSet set = new HashSet();
        TreeSet set = new TreeSet();    // Data is unordered but it is alphabetically sorted

        // here data is not added as in indexing approach.
        // we got hashcodes for elements which are being added
        set.add("John");
        set.add("Jennie");
        set.add("John");
        set.add("Becca");
        set.add("Albert");
        set.add("Jim");
        set.add("Jack");
        set.add("John");
        set.add("Joe");

        // Data is Unique, no Redundancy
        // Data is unordered in output due to hashing

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            System.out.println(o);
        }
        System.out.println(set);

        set.remove("Jim");

        System.out.println(set);
        if(set.contains("John")){
            System.out.println("John is in the set");
        }

        System.out.println("Set size is: "+set.size());
    }
}
