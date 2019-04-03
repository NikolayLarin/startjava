package com.startjava.lesson_02_03.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcPure = new Calculator();
        Scanner scanInput = new Scanner(System.in);
        char userChoice;

        do {
            System.out.println("\n" + "It's a simple calculator.");
            System.out.println("It can perform math operations");
            System.out.println("(+, -, *, /, ^, %) on natural numbers." + "\n");            
            System.out.print("Enter first number: ");
            calcPure.setNum1(scanInput.nextInt());
            System.out.print("Enter math operation: ");
            calcPure.setOperation(scanInput.next());
            System.out.print("Enter second number: ");
            calcPure.setNum2(scanInput.nextInt());
            calcPure.calculator();
            do  {
                System.out.print("Do you want to continue? (Y/N): ");
                userChoice = scanInput.next().charAt(0);
            } while (userChoice != 'Y' && userChoice != 'N');
        } while (userChoice == 'Y');        
    }
}