package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    // It`s minimal
    public static int min(int a, int b){
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c){
        int e = Math.min(a, b);
        return Math.min(e, c);
    }
    public static int min(int a, int b, int c, int d){
        int e = Math.min(a, b);
        int f = Math.min(c, d);
        return Math.min(e, f);
    }
    public static int min(int a, int b, int c, int d, int e){
        int k = Math.min(a, b);
        int f = Math.min(c, d);
        int v = Math.min(k, e);
        return Math.min(v, f);
    }

    // It`s maximum
    public static int max(int a, int b){
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c){
        int e = Math.max(a, b);
        return Math.max(e, c);
    }
    public static int max(int a, int b, int c, int d){
        int e = Math.max(a, b);
        int f = Math.max(c, d);
        return Math.max(e, f);
    }
    public static int max(int a, int b, int c, int d, int e){
        int k = Math.max(a, b);
        int f = Math.max(c, d);
        int v = Math.max(k, e);
        return Math.max(v, f);
    }
}
