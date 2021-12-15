package com.kodilla.kalkulator;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }
    public int subtrackAFromB(int a, int b) {
        return a - b;
    }
}
class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(10, 5);
        int result1 = calculator.subtrackAFromB(8, 2);
        System.out.println(result);
        System.out.println(result1);
    }
}

