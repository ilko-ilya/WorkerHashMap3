package com.ilya.worker_map.lesson2;


import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30,5,1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

    }

}
