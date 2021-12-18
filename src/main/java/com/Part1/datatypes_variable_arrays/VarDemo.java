package com.Part1.datatypes_variable_arrays;

// A simple demonstration of local variable type inference.

public class VarDemo {
    // use type inference to determine the type of the
    // variable named avg. In this case, double is inferred.
    public static void main(String[] args) {
        var avg = 10.0;
        System.out.println("Value of var: "+avg);

        var s="Shubham";
        System.out.println(s);

        // In the following context, var is not a predefined identifier.
        // It is simply a user-defined variable name.
        int var = 1;
        System.out.println("Value of var: "+ var);

        // Interestingly, in the following sequence, var is used
        // as both the type of the declaration and as a variable name
        // in the initializser.

        var k = -var;

        System.out.println("Value of k: "+k);
    }

}
