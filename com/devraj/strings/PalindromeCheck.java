package com.devraj.strings;

import java.util.Scanner;

public class PalindromeCheck {

    static boolean palindromeCheck(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String s = sc.nextLine();

        System.out.println(palindromeCheck(s));
    }
}

// streak save
