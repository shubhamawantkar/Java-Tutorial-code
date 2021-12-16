package com.shubham.Classes;

// This program uses a parameterized method.

public class Box5 {
    double width;
    double height;
    double depth;

    // compute and return volume

    double volume(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}


class BoxDemo5{
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        double vol;

        // initialize each box

        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        // get volume fo first box
        vol = mybox1.volume();
        System.out.println("Volume is "+ vol);

        // get volume of second box

        vol = mybox2.volume();
        System.out.println("Volume is "+vol);

    }
}