package com.company.chapter11;

//10-2 StringBuilder 클래스의 활용
public class Problem2 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("990925-1012999");
        str.replace(6,8," ");
        System.out.println("new str : "+str);

    }
}
