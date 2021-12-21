package com.Part1.Inheritance;


// Extend BoxWeight to include shipping costs.
// start with Box
class  Box1{
    private double width, height, depth;

    // construct clone of an object

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
        return  width*height*depth;
    }
}

// Add weight
class BoxWeight3 extends Box1{
    double weight;  // weight of box

    // construct clone of an object
    BoxWeight3(BoxWeight3 ob){
        super(ob);
        weight = ob.weight;
    }

    // constructor when all parameters are specified
    BoxWeight3(double w,double h, double d, double m){
        super(w, h, d);  // call superclass constructor
        weight  = m;
    }

    //Default constructor
    BoxWeight3(){
        super();
        weight = -1;
    }

    // constructor used when cube is created

    BoxWeight3(double len, double m){
        super(len);
        weight = m;
    }
}

// Add shipping costs.
class Shipment extends BoxWeight3{
    double cost;

    // construct clone of an object
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    // constructor when all parameters are specified
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    // default constructor
    Shipment(){
        super();
        cost = -1;
    }

    // constructor used when cube is created

    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(10,20,15,10,3.41);
        Shipment shipment1 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment.volume();
        System.out.println("Volume of shipment is "+vol);
        System.out.println("Weight of shipment1 is "+shipment.weight);
        System.out.println("Shipping cost: $"+shipment.cost);

        System.out.println();
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is "+ vol);
        System.out.println("Weight of shipment2 is "+shipment1.weight);
        System.out.println("Shipping cost: $"+shipment1.cost);

    }
}
