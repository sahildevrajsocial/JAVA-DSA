package com.devraj.recursion;
import java.util.*;

class CheckSorted {
    public boolean func(int l, int r, ArrayList<Integer> nums) {
        if(r>=nums.size()) return true;
        if(nums.get(l) > nums.get(r)) return false;
        return func(l+1, r+1, nums);
    }
    public boolean isSorted(ArrayList<Integer> nums) {
        if(nums.size() <= 1) return true;
        return func(0, 1, nums);
    }
}

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(7);
        nums.add(4);
        nums.add(5);

        CheckSorted sort = new CheckSorted();
        System.out.println(sort.isSorted(nums));
    }
}
