package com.Part1.Classes;

/*
A program that uses the box class.
 */
public class Box {
   public double width;
   public double height;
   public double depth;
}

// this class declares an object of type Box.

class BoxDemo{
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // assign values to mybox's instance variables

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // compute valume of box

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is "+ vol);

    }
}
