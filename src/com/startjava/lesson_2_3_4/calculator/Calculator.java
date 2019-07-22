package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char mathOperation;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int calculate() {

        int result = 0;
        switch (mathOperation) {
            case '+':
                result = firstNumber + secondNumber;
                return result;
            case '-':
                result = firstNumber - secondNumber;
                return result;
            case '*':
                result = firstNumber * secondNumber;
                return result;
            case '/':
                result = firstNumber / secondNumber;
                return result;
            case '%':
                result = firstNumber % secondNumber;
                return result;
            case '^':
                int power = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    power *= firstNumber;
                }
                return power;
        }
        return result;

    }
}
