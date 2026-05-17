package com.devraj.basics;
import java.util.*;

public class Condition {
    public static void main(String[] args) {
        // given an age, print adult if age >= 18, or print "Teen"
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("adult");
        }
        else {
            System.out.println("teen");
        }

        int marks = sc.nextInt();

        if(marks>=90) {
            System.out.println("Grade A");
        }
        else if (marks>=70 && marks<90) {
            System.out.println("Grade B");
        }
        else if (marks>=50 && marks<70) {
            System.out.println("Grade C");
        }
        else if (marks>=35 && marks<50) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
