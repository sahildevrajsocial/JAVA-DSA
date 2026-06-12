package com.devraj.maths;

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();

        if(number == 0) System.out.println(1);
        int count = 0;
        while(number > 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
    }
}

// count digits
