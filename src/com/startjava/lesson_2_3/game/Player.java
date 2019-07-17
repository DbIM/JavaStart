package com.startjava.lesson_2_3.game;

public class Player {
    private String name;
    private int numTry;

    public Player(String name){
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
}
