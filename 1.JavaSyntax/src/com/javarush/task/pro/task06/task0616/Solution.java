package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

import static java.lang.Math.toRadians;

public class Solution {

    public static double sin(double a) {
        double rad = toRadians(a);
        double ss =  sin(rad);
        System.out.println(ss);
        return ss;
    }

    public static double cos(double a) {
        double rad = toRadians(a);
        double ss = cos(rad);
        return ss;
    }

    public static double tan(double a) {
        double rad = toRadians(a);
        double ss = tan(rad);
        return ss;
    }
}
