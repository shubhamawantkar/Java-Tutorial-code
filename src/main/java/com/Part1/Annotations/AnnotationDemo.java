package com.Part1.Annotations;


import java.util.ArrayList;

@FunctionalInterface
interface  Abc{
    void show();
}


class A{
    public void showMyDataFromLastYearDatabase(){
        System.out.println("A Class Method");
    }
}

class B extends A{

    @Deprecated
    public void show(){
        System.out.println("Do not use this method but it is available for you");
    }
    @Override
    @SuppressWarnings("unchecked")
    public void showMyDataFromLastYearDatabase(){

        ArrayList obj = new ArrayList();
        System.out.println("B class Method");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showMyDataFromLastYearDatabase();
        obj.show();
    }
}
