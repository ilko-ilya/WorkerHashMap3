package com.ilya.worker_map.lesson2;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int odd = countOdd(new String[]{"Hello", "jav", "pocco"});
        System.out.println(odd);
    }
    public static int countOdd(String[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                count += arr[i].length();
            }
        }
        return count;

    }


}




