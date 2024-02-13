package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        try (FileReader fileReader = new FileReader(fileName1);
             FileWriter fileWriter = new FileWriter(fileName2)) {
            int count = 0;
            while (fileReader.ready()) {
                count++;
                int d = fileReader.read();
                if (count % 2 == 0) {
                    fileWriter.write(d);
                }
            }
        }

    }
}
