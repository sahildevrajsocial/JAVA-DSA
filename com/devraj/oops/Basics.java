package com.devraj.oops;

class Test {
    int age;

    public void assignAge(int num) {
        age = num;
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class Basics {
    private static void print() {
        System.out.println("I'll make it! (Maybe)");
    }
    public static void main(String[] args) {
        print();
        Test test1 = new Test();
        test1.assignAge(10);

        Test test2 = new Test();
        test2.assignAge(19);

        Test testing = new Test();

        System.out.println(testing.sum(7,7));
        System.out.println(test1.age);
        System.out.println(test2.age);
    }
}
