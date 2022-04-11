package com.javarush.task.pro.task13.task1315;

/* 
Четыре сезона
*/

public class Solution {


    public static void main(String[] args) {
        Season win = Season.WINTER;
        Season sp = Season.SPRING;
        Season sm = Season.SUMMER;
        Season au = Season.AUTUMN;


        for (int i = 0; i < Season.values().length; i++) {
            System.out.println(Season.values()[i]);
        }


    }
}
