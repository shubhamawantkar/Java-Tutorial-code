package com.Part1.Classes.Constructor;
/*
Here, Box uses a parameterized constructor to initialize the dimensions of box.

 */
public class ParameterizedConstructor {
    double width;
    double  height;
    double depth;

    // This is the constructor for ParameterizedConstructor class
    ParameterizedConstructor(double w, double h, double d){
        width = w;
        height = h;
        depth = d;

    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }
}

class  BoxDemo2{
    public static void main(String[] args) {
        // declare, allocate, and initialize ParameterizedConstructor objects
        ParameterizedConstructor mybox1 = new ParameterizedConstructor(10,20,15);
        ParameterizedConstructor mybox2 = new ParameterizedConstructor(3,6,9);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is "+ vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is "+vol);


    }
}
