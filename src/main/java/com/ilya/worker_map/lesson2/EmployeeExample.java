package com.ilya.worker_map.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeExample {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"Илья","Самиляк",2345);
        Employee emp2 = new Employee(4,"Мила","Самиляк",2400);
        Employee emp3 = new Employee(15,"Людмила","Самиляк",2123);
        Employee emp4 = new Employee(19,"Виталий","Ветренко",3456);
        Employee emp5 = new Employee(11,"Роман","Клищ",5673);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.size());
        list.add(new Employee(21,"Кира","Клищ",3421));


        Collections.sort(list);
        System.out.println(list);
    }
}
