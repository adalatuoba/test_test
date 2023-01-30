package com.phz;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        int searchWord = 2;
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord + "ÔªËØË÷ÒýÎª£º" + binarySearch(arr, searchWord));

    }
    public static int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                high = mid - 1 ;
            } else if (value > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }

}
