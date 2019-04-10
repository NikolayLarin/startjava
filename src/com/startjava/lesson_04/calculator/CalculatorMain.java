package com.startjava.lesson_04.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        Calculator calcPure = new Calculator();
        System.out.println("\n" + "It's a simple calculator.");
        System.out.println("It can perform math operations");
        System.out.println("(+, -, *, /, ^, %) on natural numbers." + "\n");

        String userChoice;
        do {
            System.out.print("Enter math expression (for example \"15 / 4\"): ");
            calcPure.setExpression(scanInput.nextLine());
            calcPure.startCalculate();
            do  {
                System.out.print("Do you want to continue? (<space> if Yes / or N if No): ");
                userChoice = scanInput.nextLine();
            } while (!userChoice.equals(" ") && !userChoice.equals("N"));
        } while (userChoice.equals(" "));
    }
}