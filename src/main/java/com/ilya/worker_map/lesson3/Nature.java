package com.ilya.worker_map.lesson3;

import java.util.Arrays;

public class Nature {
    public static void main(String[] args) {

        int[] arr = {34, 67, 2, 78, -75, 8, -19, 50, 21};

        int min = arr[0];
        int max = arr[0];
        double ave = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
            ave += arr[i] / arr.length;

        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println("Ave is: " + ave);


    }
}

