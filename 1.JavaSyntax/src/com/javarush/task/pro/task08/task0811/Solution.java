package com.javarush.task.pro.task08.task0811;

/* 
Побитовые операции
*/

public class Solution {

    public static void main(String[] args) {
        int x = 7;
       // x = x & 25; //1
       //x = x & 5; //5
        x = x & 3; //3
        x = x & 12; //4
        x = x | 1; //5
        System.out.println(x);
    }
}
