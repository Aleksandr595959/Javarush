package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
             FileOutputStream fileOutputStream1 = new FileOutputStream(fileName3)) {
            ArrayList<Integer> list = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            int file1 = 0;
            if (list.size() % 2 == 0) {
                file1 = list.size() / 2;

            } else {
                file1 = (list.size() / 2) + 1;
            }
            for (int i = 0; i < file1; i++) {
                fileOutputStream.write(list.get(i));
            }
            for (int i = file1; i < list.size(); i++) {
                fileOutputStream1.write(list.get(i));
            }

        }
    }
}