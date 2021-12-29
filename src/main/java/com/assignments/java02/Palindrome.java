package com.assignments.java02;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s){
        char ch;
        String reverse = "";
        int i;
        for(i=0;i<s.length();i++){
            ch = s.charAt(i);
            reverse = ch+reverse;
        }

        if(reverse.equals(s)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        isPalindrome(string);
        if(isPalindrome(string)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }

}
