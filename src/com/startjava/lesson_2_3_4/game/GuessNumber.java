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
                playerAttemptsLine(firstPlayer);
                playerAttemptsLine(secondPlayer);
                setupCounts(firstPlayer);
                setupCounts(secondPlayer);
                return;
            }
            count++;
        } while (true);
    }

    private boolean gameProcess(Player player) {
        System.out.println(player.getName() + " пробует угадать число: ");
        player.setAttempt(count, scan.nextInt());
        return testNumber(player);
    }

    private boolean testNumber(Player player) {
        if (player.getAttempt(count) < randomNumber) {
            System.out.println("мало");
            return false;
        } else if (player.getAttempt(count) > randomNumber) {
            System.out.println("перебор");
            return false;
        } else if (player.getAttempt(count) == randomNumber) {
            System.out.println("в яблочко!");
            count++;
            System.out.println("Игрок " + player.getName() + " угадал число с " + count + " попыток");
            return true;
        }
        return false;
    }

    private void playerAttemptsLine(Player player) {
        System.out.println("Числа игрока " + player.getName() + " : ");
        for (int i = 0; i < count; i++) {
            if (player.getAttempt(i) != 0) {
                System.out.print(player.getAttempt(i) + " ");
            }
        }
        System.out.println(" ");
    }

    private void setupCounts(Player player) {
        player.resetAttempts(count);
        count = 0;
    }
}
