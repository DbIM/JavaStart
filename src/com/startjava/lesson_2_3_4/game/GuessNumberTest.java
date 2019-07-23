package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Первый игрок, представьтесь: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.println("Второй игрок, представьтесь: ");
        Player secondPlayer = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        char answer;

        do {
            game.start();

            do {
                System.out.println('\n' + "Хотите повторить? [Y/N]: ");
                answer = scan.next().charAt(0);
            } while (answer != 'y' && answer != 'n');
        } while (answer == 'y');
    }
}
