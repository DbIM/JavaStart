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
