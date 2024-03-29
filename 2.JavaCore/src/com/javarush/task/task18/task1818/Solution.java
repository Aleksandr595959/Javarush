package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1, true);
             FileInputStream fileInputStream = new FileInputStream(fileName2);
             FileInputStream fileInputStream1 = new FileInputStream(fileName3)) {

            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.read());
            }
            while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }
        }
    }
}
