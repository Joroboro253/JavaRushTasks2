package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }
    }
}
