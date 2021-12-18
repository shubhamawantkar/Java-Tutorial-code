package com.shubham.Methods_and_Classes;

// Returning an object.
class Test5{
    int a;

    Test5(int i){
        a = i;
    }

    Test5 incrByTen(){
        Test5 temp =  new Test5(a+10);
        return temp;
    }
}

public class ReturnObj {
    public static void main(String[] args) {
        Test5 ob1 = new Test5(2);

        Test5 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("obj1.a "+ob1.a);
        System.out.println("obj2.a "+ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "+ob2.a);

    }
}
