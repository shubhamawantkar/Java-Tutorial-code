package com.Part1.Inheritance;

// Using abstract methods and classes.
abstract class  Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    // Area is now an abstract method
    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    // override are for rectangle
    double area(){
        System.out.println("Inside are for rectangle");
        return  dim1*dim2;
    }

}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    // override area for right triangle
    double area(){
        System.out.println("Inside area for triangle.");
        return dim1 * dim2;
    }
}

public class AbstractArea {
    public static void main(String[] args) {
        // Figure f = new Figure(); //Illegal now
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;  // this is ok, no object is created

        figref = r;
        System.out.println("Area is "+figref.area());

        figref = t;
        System.out.println("Area is "+figref.area());
    }
}
