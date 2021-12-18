package com.Part1.Methods_and_Classes;

// Here, Box allows one object to initialize another
public class Box1 {
    double width, height, depth;

    // Notice this constructor. It takes an object of type Box.
    Box1(Box1 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box1(double len){
        width = height = depth = len;
    }

    // compute and return volume
    double volume(){
        return width * height *depth;
    }
}

class OverloadCons2{
    public static void main(String[] args) {
        // create boxes using the various constructors

        Box1 mybox1 = new Box1(10,20,15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);  // create copy of mybox1

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is "+ vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is "+ vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is "+ vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is "+vol);
    }
}
