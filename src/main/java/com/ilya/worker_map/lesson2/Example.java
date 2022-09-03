package com.ilya.worker_map.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
       int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length -1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}




