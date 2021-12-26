package com.Part1.Enumerations;


// An enumeration of apple varieties.

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;
        // Output an enum value.
        System.out.println("Value of ap:" +ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // compare two enum values.
        if(ap == Apple.GoldenDel){
            System.out.println("ap contains GoldenDel. \n");
        }

        // use an enum to control a switch statement.
        switch(ap){
            case Jonathan:
                System.out.println("Jonathan is red.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow.");
                break;
            case RedDel:
                System.out.println("Red Delicious is red.");
                break;
            case Winesap:
                System.out.println("winesap is red.");
                break;
            case Cortland:
                System.out.println("Cortland is red.");
                break;
        }

        System.out.println("Here are all apple constants:");

        // use values()
        Apple allapples[] = Apple.values();

        for(Apple a: allapples){
            System.out.println(a);
        }

        System.out.println();

        // use of valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains "+ap);
    }
}
