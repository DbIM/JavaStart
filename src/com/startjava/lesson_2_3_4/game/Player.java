package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;

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

    public int getAttempt(int index) {
        return attempts[index];
    }

    public void setAttempt(int index, int number) {
        this.attempts[index] = number;
    }

    public void resetAttempts(int index) {
        Arrays.fill(attempts, 0, index, 0);
    }

}
