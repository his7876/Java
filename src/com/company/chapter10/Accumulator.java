package com.company.chapter10;

//10-1 클래스 변수와 클래스 메소드
public class Accumulator {
    static int sum;
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            Accumulator.add(i);
        }
        Accumulator.showResult();
    }

    private static void add(int i) {
        sum+=i;
    }

    private static void showResult() {
        System.out.println("sum = "+sum);
    }
}


