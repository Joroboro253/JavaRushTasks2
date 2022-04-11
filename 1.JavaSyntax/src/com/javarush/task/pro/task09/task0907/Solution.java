package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hex = "";

        if(decimalNumber <= 0){
            return hex;
        }

        while(decimalNumber != 0){
            char hx = HEX.charAt(decimalNumber % 16);
            hex = hx + hex;
            decimalNumber = decimalNumber / 16;
        }

        return hex;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if(hexNumber == null){
            return decimalNumber;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
        int idHex = HEX.indexOf(hexNumber.charAt(i));
        decimalNumber = 16 * decimalNumber + idHex;
        }

        return decimalNumber;
    }
}
