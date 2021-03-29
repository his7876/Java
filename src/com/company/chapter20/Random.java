package com.company.chapter20;

import java.util.Scanner;

//20-1 난수의 생성
public class Random {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A 입력 : ");
        int a = scan.nextInt();

        System.out.print("Z 입력 : ");
        int z = scan.nextInt();

        int min,max;

        if(a>z){
            min = z;
            max = a;
        }else{
            min = a;
            max = z;
        }

        java.util.Random rand = new java.util.Random();
        int rn;

        for(int i = 0; i < 10; i++) {
            rn = min;
            rn += rand.nextInt(max - min + 1);
            System.out.println(rn);
        }


    }
}
