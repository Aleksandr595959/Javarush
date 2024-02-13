package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            while (reader1.ready()) {
                String line = reader1.readLine();
                String[] parts = line.split(" ");
                for (String e : parts) {
                    long a = Math.round(Double.parseDouble(e));
                    writer.write(String.valueOf(a));
                    writer.write(" ");
                }


            }

        }
    }
}
