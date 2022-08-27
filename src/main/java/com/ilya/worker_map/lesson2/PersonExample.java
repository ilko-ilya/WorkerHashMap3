package com.ilya.worker_map.lesson2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PersonExample {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Илья", "Самиляк");
        Person person2 = new Person(2, "Мила", "Самиляк");
        Person person3 = new Person(3, "Людмила", "Самиляк");
        Person person4 = new Person(4, "Виталий", "Ветренко");
        Person person5 = new Person(5, "Роман", "Клищ");
        Person person6 = new Person(7, "Иван", "Петров");


        Map<Integer, Person> map = new HashMap<>();
        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);
        map.put(person3.getId(), person3);
        map.put(person4.getId(), person4);
        map.put(person5.getId(), person5);
        map.put(person6.getId(), person6);

        System.out.println(map.entrySet());


    }
}
