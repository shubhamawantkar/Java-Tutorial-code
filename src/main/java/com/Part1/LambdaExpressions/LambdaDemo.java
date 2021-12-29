package com.Part1.LambdaExpressions;

interface myNumber{
    double getValue();
}
public class LambdaDemo{
    public static void main(String[] args) {
        myNumber number;    // declare an interface reference

        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to number, a class intance is
        // constructed in which the lambda expression implements
        // the getValue() method in mynumber.

        number = ()-> 123.4;

        // call getValue(), which is provided by the previously assigned
        // lambda expression.
        System.out.println("A fixed value: "+number.getValue());

        // Here, a more complex expression is used.

        number = () -> Math.random()*100;

        // These call the lambda expression in the previous line.

        System.out.println("A random value:" +number.getValue());
        System.out.println("Another random value:" +number.getValue());

        // A lambda expression must be compatible with the method
        // defined by the functional interface.


    }


}
