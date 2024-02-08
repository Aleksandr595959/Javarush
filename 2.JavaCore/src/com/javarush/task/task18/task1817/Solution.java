package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            double countSymbol = 0;
            double countSpace = 0;
            while (fileInputStream.available() > 0) {
                char a = (char) fileInputStream.read();
                countSymbol++;
                if (a == ' ') {
                    countSpace++;
                }
            }
            if (countSymbol!=0){
                double result = (countSpace/countSymbol)*100;
                System.out.printf("%.2f",result);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
