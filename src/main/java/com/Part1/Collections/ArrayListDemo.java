package com.Part1.Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;

}
public class ArrayListDemo {
    public static void main(String[] args) {

        // list1 can only store String Objects
        ArrayList<String> list1 = new ArrayList<String>(); // type specific

        // list2 can store any type of object
        ArrayList list2 = new ArrayList();


        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Mike";

        list1.add("John");   //0
        list1.add("Jennie"); //1
        list1.add("Jim");    //2
        list1.add("Jack");   //3
        list1.add("John");   //4
        list1.add("Joe");    //5
     //   list1.add(10);   /// error

        list2.add("John");
        list2.add(10);
        list2.add(2.3);
        list2.add('A');
        list2.add(s1);

        // print reference to list
        System.out.println("List 1 is: "+list1);
        System.out.println("List 2 is: "+list2);

        // get the elements from list
        String name = list1.get(2);
        System.out.println("name: "+name);

        Object o = list2.get(2);
        System.out.println("o is: "+o);

        // update elements in list
        list1.set(2,"Fionna");
        System.out.println("list 1 now is: "+list1);

        list2.set(3,'B');
        System.out.println("list 2 now is: "+list2);


        // Remove elements from a list

        list1.remove(2);
        System.out.println("list 1 after remove is: "+list1);

        // list1.clear(); -> remove all

        if(list1.contains("John")) System.out.println("John is in the list");

        // Iterate in ArrayList
        System.out.println("====Iterating with enhanced for loop====");
        for(String str: list1) System.out.println(str);
        System.out.println("=======");

        System.out.println("====Iterating with for loop====");
        for(int i=0; i<list1.size(); i++) System.out.println(list1.get(i));
        System.out.println("=======");

        System.out.println("====Iterating with iterator====");

        Iterator itr = list1.iterator();
        //System.out.println(itr.next());
        //System.out.println(itr.next());
        //System.out.println(itr.next());


        while (itr.hasNext()){
            String str = (String) itr.next();
            System.out.println(str);
            if(str.equals("Jack")){
                itr.remove();
            }
        }

        System.out.println("=====");

        System.out.println("list1 after iteration is: "+list1);
    }
}
