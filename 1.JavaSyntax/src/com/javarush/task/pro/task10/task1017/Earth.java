package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

//import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

public class Earth {
    public static void main(String[] args) {
        Africa af = new Africa(400);
        Antarctica an = new Antarctica(300);
        Australia au = new Australia(40);
        Eurasia eu = new Eurasia(500);
        NorthAmerica na = new NorthAmerica(400);
        SouthAmerica sa = new SouthAmerica(500);
    }
}
