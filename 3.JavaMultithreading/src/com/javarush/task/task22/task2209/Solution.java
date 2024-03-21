package com.javarush.task.task22.task2209;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
            bufferedReader.close();
            ArrayList<String> listStrings = new ArrayList<>();
            while (fileReader.ready()) {
                String[] strings = fileReader.readLine().split(" ");
                for (String s : strings) {
                    if (!s.equals("")) {
                        listStrings.add(s);
                    }
                }
            }
            //...
            String[] listResult = sortWords(listStrings);
            StringBuilder result = getLine(listResult);
            System.out.println(result.toString().trim());
        } catch (IIOException e) {
            e.printStackTrace();
        }

    }

    public static StringBuilder getLine(String... words) {
//         String[] str = (Arrays.toString(words).split("[\\\\p{Punct}\\\\s]+"));
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : words) {
            stringBuilder.append(s).append(" ");


        }
        return stringBuilder;
    }

    private static String[] sortWords(List<String> words) {
        List<String> testList = new ArrayList<>(words);
        List<String> list = new ArrayList<>();
        for (int d = 0; d < words.size(); d++) {
            list.add(words.get(d));
            testList.remove(d);
            for (int i = 0; i < words.size() - 1; i++) {
                list.add(stringAdd(testList, list.get(i)));
                if (stringAdd(testList, list.get(i)).equals("")) {
                    break;
                }
                testList.remove(stringAdd(testList, list.get(i)));

                if (list.size() == words.size()) {
                    String[] array = new String[list.size()];
                    array = list.toArray(array);
                    return array;
                }
            }
            list.clear();
            testList.clear();
            testList.addAll(words);
        }
        String[] array = new String[list.size()];
        array = list.toArray(array);
        return array;
    }

    private static String stringAdd(List<String> words, String s) {
        String result = "";
        if (s.length() > 0) {
            for (String strings : words) {
                if (Character.toLowerCase(s.charAt(s.length() - 1)) == Character.toLowerCase(strings.charAt(0))) {
                    return strings;
                }
            }
        }

        return result;
    }

}
