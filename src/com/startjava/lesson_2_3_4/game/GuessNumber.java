package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player firstPlayer, secondPlayer;

    //объявляю количество попыток
    private int count = 0;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("У вас 10 попыток ");
        do {
            if (count == 10) {
                System.out.println("У вас закончились попытки");
                return;
            }

            if (gameProcess(firstPlayer) || gameProcess(secondPlayer)) {
                return;
            }
            count++;
        } while (true);
    }


    public boolean gameProcess(Player player) {
        System.out.println(player.getName() + " пробует угадать число: ");
        player.setAttempt(count, scan.nextInt());
        if (player.getAttempt(count) < randomNumber) {
            System.out.println("мало");
            return false;
        } else if (player.getAttempt(count) > randomNumber) {
            System.out.println("перебор");
            return false;
        } else if (player.getAttempt(count) == randomNumber) {
            System.out.println("в яблочко!");
            System.out.println("Игрок " + player.getName() + " угадал число с " + count + " попыток");
            endLine();
            return true;
        }
        return false;
    }

    public void endLine() {
        System.out.println("Числа первого игрока: ");
        for (int i = 0; i < firstPlayer.attemptsLength(); i++) {
            if (firstPlayer.getAttempt(i) != 0) {
                System.out.print(firstPlayer.getAttempt(i) + " ");
            }
        }
        System.out.println('\n' + "Числа второго игрока: ");
        for (int i = 0; i < secondPlayer.attemptsLength(); i++) {
            if (secondPlayer.getAttempt(i) != 0) {
                System.out.print(secondPlayer.getAttempt(i) + " ");
            }
        }
        firstPlayer.makeNull();
        secondPlayer.makeNull();
        count = 0;
    }
}
