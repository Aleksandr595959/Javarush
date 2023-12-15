package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String address = reader.readLine();
        FileWriter fileWriter = new FileWriter(address);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        while (true) {
            String a = reader.readLine();
            if (a.equals("exit")) {
                bufferedWriter.append(a);
                break;
            }
            bufferedWriter.append(a);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
