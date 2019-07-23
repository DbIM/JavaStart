package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int numTry;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumTry() {
        return numTry;
    }

    public void setNumTry(int numTry) {
        this.numTry = numTry;
    }

    public int copyOfAttempts(int number) {
        return attempts[number];
    }

    public void setAttempts(int attempts, int number) {
        this.attempts[attempts] = number;
    }

    public int retAttemptsLength() {
        return attempts.length;
    }

    public void fill() {
        for (int i = 0; i < attempts.length; i++) {
            attempts[i] = 0;
        }
    }


}
