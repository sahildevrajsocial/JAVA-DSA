package com.devraj.sorting;
import java.util.*;

class MergeSorted {
    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        //loop until subarrays are exhausted
        while(left <= mid && right <= high) {
            //compare left and right elements
            if(arr[left] <= arr[right]) {
                //add left element to temp
                temp.add(arr[left]);
                //move the left pointer
                left++;
            }
            else {
                //add right element to temp
                temp.add(arr[right]);
                //move the right pointer
                right++;
            }
        }
        //adding the remaining left half
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        //adding the remaining right half
        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }
        // Transferring the sorted elements to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    public void mergeSortHelper(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSortHelper(arr, low, mid);
        mergeSortHelper(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public int[] mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
        return arr;
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        MergeSorted ms = new MergeSorted();
        System.out.println(Arrays.toString(ms.mergeSort(arr)));
    }
}
