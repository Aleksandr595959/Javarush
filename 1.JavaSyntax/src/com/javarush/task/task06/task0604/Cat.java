package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;
    public String name;
    public int age;
    public Cat(){
        catCount ++;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        catCount ++;
    }
    protected void finalize() throws Throwable{
        catCount--;
    }

    public static void main(String[] args) {

    }
}