package com.devraj.sorting;
import java.util.*;

class QuickSorted {
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while(arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if(i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    public void quickSortHelper(int[] arr, int low, int high) {
        if(low < high) {
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1, high);
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length-1);
        return arr;
    }
}
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        QuickSorted qs = new QuickSorted();
        System.out.println(Arrays.toString(qs.quickSort(arr)));
    }
}
