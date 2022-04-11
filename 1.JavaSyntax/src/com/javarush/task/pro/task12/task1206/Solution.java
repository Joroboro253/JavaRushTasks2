package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] str = string.toCharArray();
        int number = 0;

        for (int i = 0; i < str.length; i++) {
            if(Character.isDigit(str[i])){
                number++;
            }
        }
        return number;
    }

    public static int countLetters(String string) {
        char[] str = string.toCharArray();
        int number = 0;
        for (int i = 0; i < str.length; i++) {
            if(Character.isLetter(str[i])){
                number++;
            }
        }
        return number;
    }

    public static int countSpaces(String string) {
        char[] str = string.toCharArray();
        int number = 0;
        for (int i = 0; i < str.length; i++) {
            if(Character.isWhitespace(str[i])){
                number++;
            }
        }
        return number;
    }
}
