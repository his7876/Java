package com.company.chapter13;

//13-1 배열과 메소드
public class Problem1 {

    public static int minValue(int[] arr){
        int val = arr[0];

        for(int i=0; i<arr.length; i++){
            if(val>arr[i]){
                val = arr[i];
            }
        }
        return val;
    }
    public static int maxValue(int[] arr){
        int val = arr[0];
        for(int i : arr){
            if(val<i){
                val = i;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,7,9,1,4};
        System.out.println("MinValue : "+ minValue(arr));
        System.out.println("MaxValue : "+ maxValue(arr));

    }
}

