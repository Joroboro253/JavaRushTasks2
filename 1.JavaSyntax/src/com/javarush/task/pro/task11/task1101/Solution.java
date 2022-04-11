package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

    public static void main(String[] args) {

        SolarSystem ss = new SolarSystem();
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + ss.getAge() + " лет.");
        System.out.println("В Солнечной системе " + ss.getPlanetsCount() + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + ss.getStarsCount() +  " звезды.");
        System.out.println("Звезды по имени " + ss.getStarName() + ".");
        System.out.println("Расстояние к центру галактики составляет " + ss.getGalacticCenterDistance() + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
