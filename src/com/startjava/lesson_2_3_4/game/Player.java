package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

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

    public int getAttempt(int index) {
        return attempts[index];
    }

    public void setAttempt(int attempts, int number) {
        this.attempts[attempts] = number;
    }

    public int attemptsLength() {
        return attempts.length;
    }

    public void makeNull() {
        Arrays.fill(attempts, 0);
    }

}
