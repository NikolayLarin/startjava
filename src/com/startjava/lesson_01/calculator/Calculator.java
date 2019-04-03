package com.startjava.lesson_01.calculator;

public class Calculator {

    public static void main(String[] args) {
        int a = 28;
        int b = 0;
        char operation = '^'; // Choose operation: +, -, *. /, ^, %

        if (operation == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (operation == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (operation == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (operation == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (operation == '^') {
            long result = 1;
            if (b > 0) {
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }                
            }
            System.out.println(a + "^" + b + " = " + result);
        } else if (operation == '%') {
            System.out.println("The remainder of dividing " + a + " / " + b + " = " + (a % b));
        } else {
            System.out.println("No operations applied on a & b.");
        }
    }
}