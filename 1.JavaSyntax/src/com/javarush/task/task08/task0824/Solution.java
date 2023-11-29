package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Вася",true, 15);
        Human child2 = new Human("Света",false,14);
        Human child3 = new Human("Олег", true , 18);
        Human father = new Human("Петя",true,50,child1,child2,child3);
        Human mather = new Human("Аня",false,45,child1,child2,child3);
        Human paternalGrandfather = new Human("Паша",true,76,father);
        Human paternalGrandmother = new Human("Оля",false,80,father);
        Human maternalGrandfather = new Human("Виталий",true,100,mather);
        Human maternalGrandmother = new Human("Юля",false,99,mather);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(paternalGrandmother);
        System.out.println(paternalGrandfather);
        System.out.println(maternalGrandfather);
        System.out.println(maternalGrandmother);
    }

    public static class Human {
       String name;
       Boolean sex;
       int age;
       ArrayList<Human> children = new ArrayList<>();

       public Human(String name,Boolean sex, int age){
           this.name=name;
           this.sex=sex;
           this.age=age;
       }
       public Human(String name , Boolean sex, int age ,Human ... children){
           this.name = name;
           this.sex = sex;
           this.age=age;
           Collections.addAll(this.children,children);
       }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
