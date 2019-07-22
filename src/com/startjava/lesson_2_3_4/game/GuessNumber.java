package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player firstPlayer, secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomNumber = (int) (Math.random() * 101);
        do {
            System.out.println(firstPlayer.getName() + " ������� ������� �����: ");
            firstPlayer.setNumTry(scan.nextInt());

            if (firstPlayer.getNumTry() < randomNumber) {
                System.out.println("����");
            } else if (firstPlayer.getNumTry() > randomNumber) {
                System.out.println("�������");
            } else if (firstPlayer.getNumTry() == randomNumber) {
                System.out.println("� �������!");
                return;
            }

            System.out.println(secondPlayer.getName() + " ������� ������� �����: ");
            secondPlayer.setNumTry(scan.nextInt());

            if (secondPlayer.getNumTry() < randomNumber) {
                System.out.println("����");
            } else if (secondPlayer.getNumTry() > randomNumber) {
                System.out.println("�������");
            } else if (secondPlayer.getNumTry() == randomNumber) {
                System.out.println("� �������!");
                return;
            }
        } while (true);
    }
}
