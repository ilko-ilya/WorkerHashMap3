package com.ilya.worker_map.lesson2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Example4 {

    public static void main(String[] args) {
        int longest = findLongest("hello javava");
        System.out.println(longest);

    }
    public static int findLongest(String sentence) {
        String[] split = sentence.split(" ");
        int max = 0;
        for (String element : split) {
            if (element.length() > max){
                max = element.length();
            }
        }
        return max;
    }
}
