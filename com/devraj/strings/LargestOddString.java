package com.devraj.strings;

import java.util.Scanner;

public class LargestOddString {
    static String s(String s) {
        int j = -1;
        for(int i = s.length() - 1; i >= 0; i--) {
            if((s.charAt(i) - '0') % 2 != 0) {
                j = i;
                break;
            }
        }
        if(j == -1) return "";

        int i = 0;
        while(i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i, j + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:- ");
        String s = sc.nextLine();

        System.out.println(s(s));
    }
}
