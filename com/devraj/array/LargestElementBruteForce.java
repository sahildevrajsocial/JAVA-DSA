package com.devraj.array;
import java.util.*;

class LargestElement{
    public int largestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}

public class LargestElementBruteForce {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        LargestElement ls = new LargestElement();
        System.out.println(ls.largestElement(arr));
    }
}
