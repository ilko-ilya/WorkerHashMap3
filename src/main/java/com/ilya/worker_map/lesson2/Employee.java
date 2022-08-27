package com.ilya.worker_map.lesson2;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String surName;
    private int salary;

    public Employee(int id,String name,String surName,int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, salary);
    }

    @Override
    public String toString() {
        return "Employee " +
                "id = " + id +
                "; имя = " + name +
                "; фамилия = " + surName +
                "; зарплата = " + salary +
                "\n";
    }

    @Override
    public int compareTo(@NotNull Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0){
            result = this.surName.compareTo(anotherEmp.surName);
        }
        return result;
    }
}
