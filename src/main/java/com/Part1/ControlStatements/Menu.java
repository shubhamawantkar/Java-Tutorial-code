package com.Part1.ControlStatements;

// Using a do-while to process a menu selection.

public class Menu{
    public static void main(String[] args)
    throws java.io.IOException{
        char choice;

        do {
            System.out.println("Help on");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println(("5. for"));
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        }while( choice < '1' || choice > '5');

        switch (choice){
            case '1':
                System.out.println(" if<condition>{\n" +
                        "block of code\n" +
                        "}");
                break;
            case '2':
                System.out.println("switch<choice>{\n" +
                        "case choice:\n" +
                        "statements;\n" +
                        "break;\n" +
                        "default:\n" +
                        "statements;\n" +
                        "}");
                break;
            case '3':
                System.out.println("while<condition>{\n" +
                        "statements;\n" +
                        "inc dec\n" +
                        "}");
                break;

            case '4':
                System.out.println("do{\n" +
                        "statements;\n" +
                        "}while<condition>;");
                break;

            case '5':
                System.out.println("for(initialize;condition;inc/dec){\n" +
                        "statements;\n" +
                        "}");
        }
    }
}
