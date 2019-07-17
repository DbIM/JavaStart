package com.startjava.lesson_2_3.calculator;


import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.println("Укажите математическую операцию (+, -, *, /, ^, %): ");
            calculator.setMathOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            System.out.println("Ответ: " + calculator.calculate());

            do {
                System.out.println("Хотите продолжить? [Y/N]: ");
                answer = scanner.next().charAt(0);
            } while (answer != 'y' && answer != 'n');
        } while (answer == 'y');
    }
}
