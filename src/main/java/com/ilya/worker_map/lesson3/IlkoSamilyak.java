package com.ilya.worker_map.lesson3;

import java.util.Arrays;
import java.util.Random;

public class IlkoSamilyak {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length -1;i >= 0 ; i--) {
            System.out.print(arr[i] + " ");

        }

    }

}
