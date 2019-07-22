package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите математическое выражение: (пример: 2 ^ 10)");
            String[] mathProcedure = scanner.nextLine().split(" ");
            calculator.setFirstNumber(Double.parseDouble(mathProcedure[0]));
            calculator.setMathOperation(mathProcedure[1].charAt(0));
            calculator.setSecondNumber(Double.parseDouble(mathProcedure[2]));
            System.out.println(calculator.calculate());

            do {
                System.out.println("Хотите продолжить? [Y/N]: ");
                answer = scanner.nextLine().charAt(0);
            } while (answer != 'y' && answer != 'n');
        } while (answer == 'y');
    }
}
