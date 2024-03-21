package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {
//            InputStreamReader isr = new InputStreamReader(new FileInputStream(args[0]), "Windows-1251");
//            BufferedReader br = new BufferedReader(isr);

//            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8);
//            BufferedWriter bw = new BufferedWriter(osw);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
