package com.Part1.LambdaExpressions;


@FunctionalInterface
interface Cab{ // when an interface will have excatly 1 abstract method we can say it as a functional interface
    //void bookCab();
    //void bookCab(String source, String destination);   // by default public abstract void bookCab();
    double bookCab(String source, String destination);
}

/*class UberX implements Cab{
    public void bookCab(){
        System.out.println("Uber Booked! Arriving soon!");
    }
}*/

public class LambdaApp {

    int instanceVar = 10;
    static int sVar = 100;
    public static void main(String[] args) {
        /*Cab cab = new UberX();
          cab.bookCab();*/

        // Anonymous class Implementation
        /*Cab cab =new Cab() {
            @Override
            public void bookCab() {
                System.out.println("Uber Booked! Arriving soon!");
            }
        };
        cab.bookCab();*/

        // Using a Lambda expressions -> Functional Interfaces


        /*double fare =  cab.bookCab("Pune","Mumbai");
        System.out.println("Face shall be: "+fare);*/

    }

    static Cab cab =(source, destination) -> {
        int localVar = 1000;
        System.out.println("Uber Booked from "+ source+ " to " +destination+" Arriving soon!");
        System.out.println("Static var is: "+ LambdaApp.sVar);
        System.out.println("Local Var is: "+localVar);
        return 850.12;
    };
}
