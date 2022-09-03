package com.ilya.worker_map.lesson3;

import java.util.Arrays;

public class IlkoSamilyak {
    public static void main(String[] args) {
        int[] arr = getArr(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(Arrays.toString(arr));

    }
    public static int[] getArr(int[] first,int[] second){
        int[] newArr = new int[first.length + second.length];
        int count = 0;

        for (int i = 0; i < first.length; i++) {
            newArr[count++] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            newArr[count++] = second[i];
        }
        return newArr;
    }
}
