package com.devraj.strings;

import java.util.Scanner;

public class ReverseStringBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String s = sc.nextLine();

        int n = s.length();
        char[] dup = new char[n];

        for(int i = 0; i < s.length(); i++) {
            dup[n - i - 1] = s.charAt(i);
        }
        String reversed = new String(dup);
        System.out.println(reversed);
    }
}
