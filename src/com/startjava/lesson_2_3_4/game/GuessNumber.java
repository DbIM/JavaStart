package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player firstPlayer, secondPlayer;

    //объявляю количество попыток
    private int count = 0;

    //объявляю переменую для хранения введенного игроком числа
    private int tryGuess;

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
            System.out.println(firstPlayer.getName() + " пробует угадать число: ");
            tryGuess = scan.nextInt();
            firstPlayer.setNumTry(tryGuess);
            firstPlayer.setAttempts(count, tryGuess);
            count++;
            if (firstPlayer.getNumTry() < randomNumber) {
                System.out.println("мало");
            } else if (firstPlayer.getNumTry() > randomNumber) {
                System.out.println("перебор");
            } else if (firstPlayer.getNumTry() == randomNumber) {
                System.out.println("в яблочко!");
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число с " + count + " попыток");
                end();
                return;
            }
            count--;

            System.out.println(secondPlayer.getName() + " пробует угадать число: ");
            tryGuess = scan.nextInt();
            secondPlayer.setNumTry(tryGuess);
            secondPlayer.setAttempts(count, tryGuess);
            count++;
            if (secondPlayer.getNumTry() < randomNumber) {
                System.out.println("мало");
            } else if (secondPlayer.getNumTry() > randomNumber) {
                System.out.println("перебор");
            } else if (secondPlayer.getNumTry() == randomNumber) {
                System.out.println("в яблочко!");
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число с " + count + " попыток");
                end();
                return;
            }
        } while (true);
    }

    public void end() {
        System.out.println("Числа первого игрока: ");
        for (int i = 0; i < firstPlayer.retAttemptsLength(); i++) {
            if (firstPlayer.copyOfAttempts(i) != 0) {
                System.out.print(firstPlayer.copyOfAttempts(i) + " ");
            }
        }
        System.out.println('\n' + "Числа второго игрока: ");
        for (int i = 0; i < secondPlayer.retAttemptsLength(); i++) {
            if (secondPlayer.copyOfAttempts(i) != 0) {
                System.out.print(secondPlayer.copyOfAttempts(i) + " ");
            }
        }
        firstPlayer.fill();
        secondPlayer.fill();
        count = 0;
    }
}
