package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";
    // C:\wallpaper\1.jpg
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        do {
            String  pathStr = scanner.nextLine();

            if(Files.isRegularFile(Path.of(pathStr))){
                System.out.println(pathStr + THIS_IS_FILE);
            } else if(Files.isDirectory(Path.of(pathStr))){ //getParent
                System.out.println(pathStr + THIS_IS_DIR);
            } else {
                check = false;
            }
        } while (check);

    }
}

