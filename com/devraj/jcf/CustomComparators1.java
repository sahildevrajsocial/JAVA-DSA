package com.devraj.jcf;

import java.util.*;

public class CustomComparators1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        // sort it in the descending order\
        Collections.sort(al, new Comparator<Integer>() {
           // [num1, num2]
           @Override
           public int compare(Integer num1, Integer num2) {
               // num1 < num2
               // order is wrong
               if(num1 < num2) {
                   return 1;
               }
               else if(num1 > num2) {
                   return -1;
               }
               return 0;
           }
        });
        System.out.println(al);
    }
}

// custom operator
//