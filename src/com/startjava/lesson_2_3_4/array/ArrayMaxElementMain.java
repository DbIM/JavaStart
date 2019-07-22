package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];
        System.out.print("Заполните массив целыми числами через пробел: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
