package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Космическая одиссея ч.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
//        Astronaut Mask = new Human();
//        Astronaut Umka = new Cat();
//        Astronaut Sharik = new Dog();
//        Astronaut Huiston = new Human();
//        astronauts.add(0, Mask);
//        astronauts.add(0, Umka);
//        astronauts.add(0, Sharik);
//        astronauts.add(0, Huiston);

        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Cat());
        astronauts.add(new Dog());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
