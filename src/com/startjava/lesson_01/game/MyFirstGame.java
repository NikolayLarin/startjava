package com.startjava.lesson_01.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int inputNumber = 65;        
        int hiddenNumber = 61;

        while (inputNumber != hiddenNumber) {
            if (inputNumber > hiddenNumber) {
                System.out.println("Entered number is more than hidden.");
                inputNumber -= 1;
            } else if (inputNumber < hiddenNumber) {
                System.out.println("Entered number is less than hidden.");
                inputNumber += 1;
            }                        
        }
        System.out.println("\n" + "Congratulations! You guessed!");
        System.out.println("The hidden number is " + inputNumber + "." + "\n");
    }
}