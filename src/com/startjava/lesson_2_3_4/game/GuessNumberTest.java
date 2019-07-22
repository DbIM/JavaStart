package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������ ����� �������������");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.println("������ ����� �������������");
        Player secondPlayer = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        char answer;

        do {
            game.start();

            do {
                System.out.println("������ ����������? [Y/N]: ");
                answer = scan.next().charAt(0);
            } while (answer != 'y' && answer != 'n');
        } while (answer == 'y');
    }
}
