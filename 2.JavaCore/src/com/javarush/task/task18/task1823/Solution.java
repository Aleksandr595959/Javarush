package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            } else {
                new ReadThread(fileName).start();

            }
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int[] byteCountArray = new int[256];

            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

                while (fileInputStream.available() > 0) {
                    int currentByte = fileInputStream.read();
                    byteCountArray[currentByte]++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for (int i = 0; i < byteCountArray.length; i++) {
                if (byteCountArray[i] > maxCount) {
                    maxCount = byteCountArray[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(fileName, maxCountByte);
        }
    }
}
