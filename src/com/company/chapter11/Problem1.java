package com.company.chapter11;

//10-1 String 클래스의 활용
public class Problem1 {
    static String str = "990925-1012999";

    public static void main(String[] args) {
        String text = str.replace("-"," ");
        System.out.println("str : "+str);
        System.out.println("text : "+text);

    }
}
