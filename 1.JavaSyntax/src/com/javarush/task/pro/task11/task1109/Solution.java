package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer oi = new Outer();
        Outer.Inner in = oi.new Inner();

        Outer.Nested on = new Outer.Nested();
    }
}
