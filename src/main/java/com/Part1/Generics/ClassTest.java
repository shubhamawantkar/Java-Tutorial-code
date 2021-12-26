package com.Part1.Generics;

import javax.swing.*;

interface I{}
class A implements I{
    void m1(){
        System.out.println("m1 from A class");
    }
}

class B implements I{

}

public class ClassTest <T>{
    T x;
    ClassTest(T x){
        this.x = x;
    }

    T getValue(){
        return x;
    }
}

