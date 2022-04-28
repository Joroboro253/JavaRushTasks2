package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    static String src = scanner.nextLine();

    static Scanner sc = new Scanner(System.in);
    static String dest = sc.nextLine();

    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest))
        {
            byte[] buffer = new byte[65536];
            while (input.available() > 0)
            {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

