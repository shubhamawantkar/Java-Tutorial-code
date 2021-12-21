package com.Part1.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Stud{
    int roll;
    String name;

    LinkedList student = new LinkedList();

    Stud(){
        roll = 0;
        name = null;
    }
    public void getStudInfo(int r, String n){
        roll = r;
        name = n;
    }

    void addToDirectory(){
        student.add(roll);
        student.add(name);
    }

    void printDirectory(){
        for (Iterator it = student.iterator(); it.hasNext(); ) {
            Object o = it.next();
            System.out.print(o+"        ");
        }

    }
}
public class LinkedListDemo1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Stud s = new Stud();
        System.out.print("How many Students you want to add:");
        int size = input.nextInt();

        for(int i=0; i<size; i++){
            System.out.print("Enter roll no:");
            int roll = input.nextInt();
            System.out.print("Enter Name:");
            String name = input.next();
            s.getStudInfo(roll, name);
            s.addToDirectory();
        }

        s.printDirectory();

    }

}
