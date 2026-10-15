package com.devraj.recursion;
import java.util.*;

class ReverseArray {
    public void func(int l, int r, int[] nums) {
        if(l>=r) return;
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

        func(l+1, r-1, nums);
    }
    public int[] reverseArray(int[] nums) {
        func(0, nums.length-1, nums);
        return nums;
    }
}

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ReverseArray reverse = new ReverseArray();
        System.out.println(Arrays.toString(reverse.reverseArray(arr)));
    }
}
