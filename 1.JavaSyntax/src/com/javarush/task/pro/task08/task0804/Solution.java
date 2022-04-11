package com.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
//        int[] arr = new int[100];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random()*100);
//        }
//        int b = (int) (Math.random()*100) + 1;
        return  (int) (Math.random()*99);
    }
}
