package com.ilya.worker_map.lesson3;

import java.util.Arrays;

public class Nature {
    public static void main(String[] args) {
        int[] arr = {56, 89, 43, 2, -6, 0, 46, 19};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length -i; j++) {
                if (arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                }
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
