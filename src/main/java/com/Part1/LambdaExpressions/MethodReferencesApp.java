package com.Part1.LambdaExpressions;


@FunctionalInterface
interface Calculator{
    void add(int num1, int num2);
}

class CalC{
    public static  void addSomething(int n1, int n2){
        System.out.println("Addition is: "+(n1+n2));
    }
    public void letsAdd(int n1, int n2){
        System.out.println("Addition is: "+(n1+n2));
    }
}

@FunctionalInterface
interface  Messager{
    Message getMessage(String msg);
}

class  Message{
    Message(String msg){
        System.out.println(">> Message is: "+msg);
    }
}
public class MethodReferencesApp {
    public static void main(String[] args) {
        //CalC.addSomething(10,20);

        //1. Reference to a static method
        /*Calculator cRef = CalC::addSomething; // Method reference
        cRef.add(11,14);*/

        //2. Reference to non-static method
        //Object construction statement for CalC
        /*CalC cal = new CalC();
        Calculator cRef = cal::letsAdd;
        cRef.add(12,23);*/


        //3. Reference to Constructor
        Messager mReg = Message::new;
        mReg.getMessage("Search the candle rather than searching the darkness");

    }
}
