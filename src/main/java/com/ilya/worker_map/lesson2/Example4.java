package com.ilya.worker_map.lesson2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Example4 {

    public static void main(String[] args) {
        int[] arr = {66, 54, -9, 78, 33, 23, 12};
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length -i; j++) {
                if (arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}