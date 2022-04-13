package com.javarush.task.pro.task14.task1408;

/* 
Проглатываем исключение
*/

public class Solution {

    public static String errorMessage = "не повезло";

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber;
        try {
            luckyNumber = (int) (Math.random() * 100);
        } catch (Exception e) {
            System.out.println(errorMessage);
            return;
        }

        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
