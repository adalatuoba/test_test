package com.phz;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = {3, 1, 6, 8, 9, 0, 7, 4, 5, 2};
        System.out.println("‘≠ ºÀ≥–Ú" + Arrays.toString(values));
        bubbleSort(values);
        System.out.println("≈≈–Ú∫ÛÀ≥–Ú" + Arrays.toString(values));

    }

    public static void bubbleSort(int [] values){
        int temp;
        boolean exchange;
        for (int i = 0; i < values.length; i++){
            exchange = false;
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = temp;
                    exchange = true;
                }
            }
            if (!exchange){
                break;
            }
            System.out.println((i+1)+"Ã…≈≈–Ú∫ÛÀ≥–Ú" + Arrays.toString(values));
        }
    }
}
