package com.shubham.Methods_and_Classes;

public class Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when no dimensions specified
    Box(){
        width = -1;   // use -1 to indicate
        height = -1;  // an uninitialized
        depth = -1;     // box
    }

    // constructor used when cube is created
    Box(double len){
        width = height = depth = len;
    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }
}

class OverloadCons{
    public static void main(String[] args) {
        // create boxex using the various constructors
        Box mybox = new Box(10,20,15);
        Box mybox1 = new Box();
        Box mycube = new Box(7);
        double vol;

        // get volume of first box
        vol = mybox.volume();
        System.out.println("Volume of mybox is "+vol);

        // get volume of second box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is "+ vol);

        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is "+ vol);
    }
}
