package com.javarush.task.pro.task10.task1021;

/* 
Автопроизводитель
*/

//import org.omg.CosNaming.BindingIterator;

public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

}
