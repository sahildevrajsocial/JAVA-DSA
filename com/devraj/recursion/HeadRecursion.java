package com.devraj.recursion;

class Helper {
    int count = 0;

    public void func() {
        if(count == 7) return;
        count++;
        func();
        System.out.println("Devraj");
    }
}

public class HeadRecursion {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.func();
    }
}
