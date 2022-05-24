package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {
    static Calendar birthDate = new GregorianCalendar(2001, 11, 7);


       // System.out.println(formatter.format(date));

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", new Locale(("ru")));
        String message = formatter.format(birthDate);
       // System.out.println(formatter.format(birthDate.get(Calendar.DAY_OF_WEEK)));
        return message;
    }
}
