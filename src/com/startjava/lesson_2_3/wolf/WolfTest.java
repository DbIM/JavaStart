package com.startjava.lesson_2_3.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();

        firstWolf.setMale(true);
        if (firstWolf.setMale(true)) {
            System.out.println("Суровый самец");
        } else {
            System.out.println("Лесная стерва");
        }

        firstWolf.setNick("Шарик");
        System.out.println(firstWolf.getNick());

        firstWolf.setWeight(25.5f);
        System.out.println("Могучий вес равен: " + firstWolf.getWeight());

        firstWolf.setAge(33);
        System.out.println("Пережитых зим: " + firstWolf.getAge());

        firstWolf.setColor("черный как ночь");
        System.out.println("Цвета " + firstWolf.getColor());

        firstWolf.walk();

        firstWolf.sit();

        firstWolf.run();

        firstWolf.howl();

        firstWolf.hunt();
    }
}
