package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";


    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //int decimalNumber = 0;
        String hex = "";

        if(binaryNumber == null || binaryNumber == "") {
            return "";
        }
        if((binaryNumber.length() % 4) != 0){
            String formBinaryNumber = String.format("%01s", binaryNumber); // добавление нулей

           // char
            for (int i = 0; i < formBinaryNumber.length() / 4; i++) {
                //char hx = HEX.charAt(binaryNumber % 2);
            }
        }




        return null;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }
}
