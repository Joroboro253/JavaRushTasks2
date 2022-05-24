package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

/* 
Пропускаем не всех
*/
// D:/programming/testReadBytes/copy.txt
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Path.of(sc.nextLine()));

        int counterStrings = 1;

        {
            for (int i = 0; i < lines.size(); i++) {
                if(counterStrings % 2 != 0)
                System.out.println(lines.get(i));

                counterStrings++;
            }
        }
    }
}
