package com.Part1.ExceptionHandling;


class  Exe1{
    static  void subroutine(){
        try {
            int d = 0;
            int a = 42/d;
            System.out.println("This will not be printed");
        }catch (Exception e){
            System.out.println("Exception occcured: Division by zero");
        }
        System.out.println("After catch statement");

    }
}
public class Exc0 {
    public static void main(String[] args) {
       Exe1.subroutine();
    }
}
