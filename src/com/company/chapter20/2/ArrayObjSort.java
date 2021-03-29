package com.company.chapter20;
import java.util.Arrays;

//20-2 정렬의 기준 수정하기  (내림차순, 이름 길이 순 정렬)
class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 /**   @Override   내림차순 정렬
    public int compareTo(Object o) {
        Person p = (Person) o;
        if(this.age>p.age)
            return -1;
        else if(this.age < p.age)
            return 1;
        else return 0;
    }

  **/

     @Override  //이름 길이 순 정렬
     public int compareTo(Object o) {
         Person p = (Person) o;
         return this.name.length() -p.name.length();
     }

    @Override
    public String toString() {
        return name + ": "+age;
    }
}

public class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lesss",29);
        ar[1] = new Person("Ks",17);
        ar[2] = new Person("Sosssss",40);

        Arrays.sort(ar);
        for(Person p : ar){
            System.out.println(p);
        }
    }
}
