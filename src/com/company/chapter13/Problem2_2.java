package com.company.chapter13;

//13-2 2차원 배열의 구조 활용  문제 1
public class Problem2_2 {

    public static void moveArr(int arr[][]){
        int[] lastLow = arr[arr.length - 1];

        for(int low = arr.length - 1; low > 0; low--)
            arr[low] = arr[low - 1];

        arr[0] = lastLow;
    }

    public static void showArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("--원본--");
        showArr(arr);

        moveArr(arr);
        System.out.println("--1번 이동--");
        showArr(arr);

        moveArr(arr);
        System.out.println("--2번 이동--");
        showArr(arr);




    }
}
