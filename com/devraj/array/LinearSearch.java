package com.devraj.array;
class LinearSearching {
    public int func(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        LinearSearching ls = new LinearSearching();
        System.out.println(ls.func(arr, 4));
    }
}
