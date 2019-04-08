package com.startjava.lesson_04.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calcPure = new Calculator();
        Scanner scanInput = new Scanner(System.in);

        String userChoice;
        do {
            System.out.println("\n" + "It's a simple calculator.");
            System.out.println("It can perform math operations");
            System.out.println("(+, -, *, /, ^, %) on natural numbers." + "\n");            
            System.out.print("Enter math expression, for example 2 ^ 10 : ");
            calcPure.setExpression(scanInput.nextLine());
            calcPure.calculator();
            do  {
                System.out.print("Do you want to continue? (Y/N): ");
                userChoice = scanInput.next();
            } while (!userChoice.equals("Y") && !userChoice.equals("N"));
        } while (userChoice.equals("Y"));
    }
}