package com.javarush.task.pro.task18.task1802;

/*
Сортировка по возрасту
*/

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return student2.getAge() - student1.getAge();
    }

}
