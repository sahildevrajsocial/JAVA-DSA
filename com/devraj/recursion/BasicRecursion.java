package com.devraj.recursion;

import java.util.Scanner;

public class BasicRecursion {
    static int count = 0;
    public static void func() {
        if(count == 7) return;
        count++;
        System.out.println("Devraj");
        func();
    }

    public static void main(String[] args) {
        func();
    }
}
