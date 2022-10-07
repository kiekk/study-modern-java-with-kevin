package com.example.modernjava;

public class OopAnotherExample {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        int additionResult = calculatorService.calculate('+', 1, 1);
        System.out.println(additionResult);

        int subtractionResult = calculatorService.calculate('-', 1, 1);
        System.out.println(subtractionResult);

        int multiplicationResult = calculatorService.calculate('*', 1, 1);
        System.out.println(multiplicationResult);

        int divisionResult = calculatorService.calculate('/', 9, 3);
        System.out.println(divisionResult);
    }
}

class CalculatorService {
    // 요구사항 추가
    // 1. 뺄셈 기능 추가 - calculation 추가하여 덧셈 / 뺄셈 처리
    // 2. 곱셈 기능 추가 - calculation if문 추가
    // 3. 나눗셈 기능 추가 - calculation if문 추가
    public int calculate(char calculation, int num1, int num2) {

        if (calculation == '+') {
            return num1 + num2;
        } else if (calculation == '-') {
            return num1 - num2;
        } else if (calculation == '*') {
            return num1 * num2;
        } else if (calculation == '/') {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Unknown calculation : " + calculation);
        }
    }
}