package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        //Проверочный тест.
        calculate(6, 3, '+');
        calculate(6, 3, '-');
        calculate(6, 3, '*');
        calculate(6, 3, '/');
        calculate(6, 0, '^');
        calculate(6, 3, '%');
    }
    
    public static void calculate(int firstNumber, int secondNumber, char mathOperation) {
        if (mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathOperation == '^') {
            int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        } else if (mathOperation == '%') {
            System.out.println(firstNumber % secondNumber);
        }
    }
}
