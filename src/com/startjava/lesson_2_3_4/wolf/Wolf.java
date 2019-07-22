package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
    private boolean isMale;
    private String nick;
    private float weight;
    private int age;
    private String color;

    public boolean isMale() {
        return isMale;
    }

    public boolean setMale(boolean male) {
        isMale = male;
        return male;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Расслабленно гуляет.");
    }

    public void sit() {
        System.out.println("Напряженно сидит!");
    }

    public void run() {
        System.out.println("Мчит как ветер.");
    }

    public void howl() {
        System.out.println("Воет: Yyyyyy");
    }

    public void hunt() {
        System.out.println("Сидит в засаде.");

    }
}
