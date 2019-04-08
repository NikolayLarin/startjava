package com.startjava.lesson_04.calculator;

public class Calculator {
    private int[] nums = new int[2];

    private String expression;
    int num1, num2;  /////  U D A L I T '
    private char[] array = {'+', '-', '*', '/', '^', '%'};

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public void calculator() {
        switch (expression) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case "^":
                long result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.println(num1 + "^" + num2 + " = " + result);
                break;
            case "%":
                System.out.println("The remainder of dividing " + num1 + " / " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("No operations applied on numbers");
                break;
        }
    }
}