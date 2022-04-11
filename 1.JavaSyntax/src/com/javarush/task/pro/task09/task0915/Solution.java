package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //int num = 0;


        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] token = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens())
        {
            for (int i = 0; i < token.length; i++) {
                token[i] = tokenizer.nextToken();
            }
        }
        return token;


    }
}
