package com.company.chapter20.problem3;

import java.util.Arrays;
//20-3 탐색의 기준 변경

class Person implements Comparable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return name + ": "+age;
    }
}

public class ArrayObjSearch {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee",29);
        ar[1] = new Person("Goo",17);
        ar[2] = new Person("Soo",40);
        Arrays.sort(ar);
        int idx = Arrays.binarySearch(ar,new Person("Soo",40));
        System.out.println(ar[idx]);
    }
}
