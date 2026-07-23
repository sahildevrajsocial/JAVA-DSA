package com.devraj.recursion;

class Help{
    int count = 0;
    public void func() {
        if(count == 7) return;
        count++;

        System.out.println("Devraj");
        func();
    }
}

public class TailRecursion {
    public static void main(String[] args) {
        Help help = new Help();
        help.func();
    }
}
