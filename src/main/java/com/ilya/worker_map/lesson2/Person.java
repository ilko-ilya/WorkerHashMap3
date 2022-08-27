package com.ilya.worker_map.lesson2;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private String surName;

    public Person(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName);
    }

    @Override
    public String toString() {
        return "Person " +
                "id = " + id +
                "; имя = " + name +
                "; фамилия = " + surName +
                ".\n";
    }

    @Override
    public int compareTo(@NotNull Person anotherPerson) {
        int result = this.id - anotherPerson.id;
        if (result == 0) {
            result = this.surName.compareTo(anotherPerson.surName);
        }
        return result;
    }
}
