package com.javarush.task.pro.task05.task0521;

/* 
Выполнение фрагмента кода
*/

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int [] arr = {10, 8, 5, 3, 9};
        boolean isSorted = false;
        int tmp;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                  isSorted = false;
                  tmp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

