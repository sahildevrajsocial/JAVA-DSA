package com.devraj.basics;

public class Basics {
    public static void main(String[] args) {
        //the following line prints hello
        System.out.println("hello!");

        // byte: -128 to 127, takes 8bits in the memory
        byte num1 = 100;
        System.out.println(num1);

        // short: -32,768 to 32,767, takes 16 bits in the memory
        short num2 = 100;
        System.out.println(num2);

        // int: -2^31 to 2^32 - 1, takes 32 bits in the memory
        int num3 = 100;
        System.out.println(num3);

        // long: -2^63 to 2^63 - 1, takes 64 bits in the memory
        long num4 = 1000;
        System.out.println(num4);

        // float: 15 decimal digits of precision, takes 64 bits in the memory
        double num5 = 1.6;
        System.out.println(num5);

        char ch = 'a';
        System.out.println(ch);

        boolean fl = true;
        System.out.println(fl);

        // arithmatic operators -, +, /, *, %
        int number1 = 5;
        int number2 = 12;
        int number3 = number2 / number1;
        System.out.println(number3);

        // unary operators +, -, ++, --, !
        int n1 = 6;
        int n2 = -n1;
        System.out.println(n2);
    }
}
