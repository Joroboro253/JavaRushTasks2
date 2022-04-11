package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber > 0) {
            int i = 0;
            double octal = 0;

            while(decimalNumber != 0){
                octal = octal + (decimalNumber % 8) * Math.pow(10, i);
                decimalNumber = decimalNumber / 8;
                i++;
            }

            return (int) octal;
        } else {
            return 0;
        }

    }

    public static int toDecimal(int octalNumber) {
        if(octalNumber > 0){
            int i = 0;
            double decimal = 0;

            while(octalNumber != 0){
                decimal = decimal + (octalNumber % 10) * Math.pow(8, i);
                octalNumber = octalNumber / 10;
                i++;
            }

            return (int) decimal;
        } else {
            return 0;
        }
    }
}
