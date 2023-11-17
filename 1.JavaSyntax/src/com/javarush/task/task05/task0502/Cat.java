package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age,int weight,int strength) {
       this.age = age;
       this.weight = weight;
       this.strength = strength;


    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(3, 5,8);
        Cat cat2 = new Cat(5,6,9);
        System.out.println(cat1.fight(cat2));


    }
}
