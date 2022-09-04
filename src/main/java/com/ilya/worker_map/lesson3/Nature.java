package com.ilya.worker_map.lesson3;

import java.util.Arrays;

public class Nature {
    public static void main(String[] args) {
        int i = countSymbols("Jhj,.!lkjlk.,adfa.!");
        System.out.println(i);
    }
    public static int countSymbols(String sentence){
        String replaces = sentence.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return sentence.length() - replaces.length();
    }

}

