package com.javarush.task.pro.task10.task1014;

/* 
Купи 10 батонов
*/

public class Market {
    private static boolean hasEggs = true;

    public boolean getHasEggs(){
        return hasEggs;
    }

    public void setHasEggs(boolean hasEggs){
        this.hasEggs = hasEggs;
    }

    public static void main(String[] args) {

        Market atb = new Market();
        boolean hasEggs = true;
        atb.setHasEggs(hasEggs);
        makePurchases(atb.getHasEggs());
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
}
