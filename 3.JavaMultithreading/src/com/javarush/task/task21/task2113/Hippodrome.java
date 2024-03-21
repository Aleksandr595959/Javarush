package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;


    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("\uD83D\uDC0E" + ThreadColor.ANSI_GREEN, 3, 0));
        horses.add(new Horse("\uD83D\uDC0E" + ThreadColor.ANSI_RED, 3, 0));
        horses.add(new Horse("\uD83D\uDC0E" + ThreadColor.ANSI_YELLOW, 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse h : horses) {
            if (h.getDistance() > result.getDistance()) {
                result = h;
            }
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    static class ThreadColor {
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_GREEN = "\u001B[32m";
    }
}
