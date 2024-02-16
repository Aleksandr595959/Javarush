package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] lines = line.split(" ");
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < lines.length - 3; i++) {
                    stringBuilder.append(lines[i]).append(" ");
                }
                String name = String.valueOf(stringBuilder);
                int year = Integer.parseInt(lines[lines.length - 1]);
                int month = Integer.parseInt(lines[lines.length - 2]) - 1;
                int day = Integer.parseInt(lines[lines.length - 3]);
                Calendar birthDay = new GregorianCalendar(year, month, day);
                PEOPLE.add(new Person(name.trim(), birthDay.getTime()));
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}




