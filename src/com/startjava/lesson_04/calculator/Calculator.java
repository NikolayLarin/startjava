package com.startjava.lesson_04.calculator;

import java.util.Scanner;

public class Calculator {

    private String expression;
    private Scanner scanInput = new Scanner(System.in);
    private int[] nums = new int[2];
    private char mathOperation;

    public void setExpression(String expression) {
        this.expression = checkExpression(expression);
    }

    private String checkExpression(String expression) {
        boolean isExpressionChecked = expression.matches("\\s*\\d*\\s*[|\\+|\\-|\\*|\\/|\\^|\\%]\\s*\\d*\\s*");
        while(!isExpressionChecked) {
            System.out.print("Incorrect math expression, try again!: ");
            expression = scanInput.nextLine();
            isExpressionChecked = expression.matches("\\s*\\d*\\s*[|\\+|\\-|\\*|\\/|\\^|\\%]\\s*\\d*\\s*");
        }
        return expression;
    }

    public void startCalculate() {
        splitIntoComponents(expression);
        calculate();
    }

    private void splitIntoComponents(String expression) {
        expression = expression.replaceAll("\\s+", "");
        String[] components = expression.split("[+\\-*/^%]");
        this.nums[0] = Integer.parseInt(components[0]);
        this.nums[1] = Integer.parseInt(components[1]);
        this.mathOperation = expression.charAt(expression.length()-components[1].length()-1);
    }

    private void calculate() {
        switch (mathOperation) {
            case '+':
                System.out.println(nums[0] + " + " + nums[1] + " = " + Math.addExact(nums[0], nums[1]));
                break;
            case '-':
                System.out.println(nums[0] + " - " + nums[1] + " = " + Math.subtractExact(nums[0], nums[1]));
                break;
            case '*':
                System.out.println(nums[0] + " * " + nums[1] + " = " + Math.multiplyExact(nums[0], nums[1]));
                break;
            case '/':
                System.out.println(nums[0] + " / " + nums[1] + " = " + Math.floorDiv(nums[0], nums[1]));
                break;
            case '^':
                System.out.println(nums[0] + "^" + nums[1] + " = " + Math.pow(nums[0], nums[1]));
                break;
            case '%':
                System.out.println("The remainder of dividing "
                        + nums[0] + " / " + nums[1] + " = " + Math.IEEEremainder(nums[0], nums[1]));
                break;
            default:
                System.out.println("No operations applied on numbers");
                break;
        }
    }
}