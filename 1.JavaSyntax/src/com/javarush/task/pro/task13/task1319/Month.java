package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final Month [] array = Month.values();


//    public static Month[] get(int one, int two, int three){
//        Month treeM[] = new Month[3];
//        for (int i = 0; i < Month.values().length; i++) {
//            switch (Month.values()[i].ordinal()) {
//                case one:
//                    treeM[0] = Month.values()[i];
//
//                    break;
//                case two:
//                    treeM[1] = Month.values()[i];
//
//                    break;
//                case three:
//                    treeM[2] = Month.values()[i];
//
//                    break;
//            }
//        return
//    }

    public static Month[] getWinterMonths() {
        Month winter[] = new Month[3];
        for (int i = 0; i < Month.values().length; i++) {

            switch (Month.values()[i].ordinal()) {
                case 0:
                    winter[0] = Month.values()[i];
                    //list.add(0, Month.values()[i]);
                    break;
                case 1:
                    winter[1] = Month.values()[i];
                    //list.add(1, Month.values()[i]);
                    break;
                case 11:
                    winter[2] = Month.values()[i];
                    //list.add(2, Month.values()[i]);
                    break;
            }

        }
        return winter;
    }

    public static Month[] getSpringMonths() {
        Month spring[] = new Month[3];
        for (int i = 0; i < Month.values().length; i++) {
            switch (Month.values()[i].ordinal()) {
                case 2:
                    spring[0] = Month.values()[i];
                    break;
                case 3:
                    spring[1] = Month.values()[i];

                    break;
                case 4:
                    spring[2] = Month.values()[i];
                    break;
            }

        }

        return spring;
    }

    public static Month[] getSummerMonths() {
        Month summer[] = new Month[3];
        for (int i = 0; i < Month.values().length; i++) {
            switch (Month.values()[i].ordinal()) {
                case 5:
                    summer[0] = Month.values()[i];
                    break;
                case 6:
                    summer[1] = Month.values()[i];
                    break;
                case 7:
                    summer[2] = Month.values()[i];
                    break;
            }

        }

        return summer;
    }

    public static Month[] getAutumnMonths() {
        Month autumn[] = new Month[3];
        for (int i = 0; i < Month.values().length; i++) {
            switch (Month.values()[i].ordinal()) {
                case 8:
                    autumn[0] = Month.values()[i];
                    break;
                case 9:
                    autumn[1] = Month.values()[i];
                    break;
                case 10:
                    autumn[2] = Month.values()[i];
                    break;
            }

        }

        return autumn;
    }
}


