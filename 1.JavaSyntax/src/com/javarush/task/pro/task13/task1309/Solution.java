package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Den", 5.3);
        grades.put("Vova", 8.9);
        grades.put("Vetal", 10.0);
        grades.put("Kolya", 8.6);
        grades.put("Dima", 3.5);
    }
}
