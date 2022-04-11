package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/* 
Утильный класс: часть 1
*/

public class Solution {

    public static double sin(double a) {
        double rad = Math.toRadians(a);
        double ss =  Math.sin(rad);
        return ss;
    }

    public static double cos(double a) {
        double rad = Math.toRadians(a);
        double ss = Math.cos(rad);
        return ss;
    }

    public static double tan(double a) {
        double rad = Math.toRadians(a);
        double ss = Math.tan(rad);
        return ss;
    }
}
