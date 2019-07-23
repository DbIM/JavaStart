package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char mathOperation;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate() {
        double result = 0;
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
                return Math.pow(firstNumber, secondNumber);
        }
        return result;
    }
}
