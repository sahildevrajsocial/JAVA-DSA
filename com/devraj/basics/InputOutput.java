package com.devraj.basics;
import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        double num2 = sc.nextDouble();
        System.out.println(num2);

        String name = sc.next();
        System.out.println(name);
        sc.close();
    }
}
