package com.startjava.lesson_04.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber = new Random().nextInt(100);
    private int maxAttemptNumber = 10;
    private Scanner scanInput = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGuessNumberGame() {
        int attemptNumber = 1;
        while (attemptNumber <= maxAttemptNumber) {
            enterPlayerNumber(playerOne, attemptNumber);
            compareNumbers(playerOne, attemptNumber);
            enterPlayerNumber(playerTwo, attemptNumber);
            compareNumbers(playerTwo, attemptNumber);
            attemptNumber++;
        }
    }

    private void enterPlayerNumber(Player player, int attemptNumber) {
        int number;
        do {
            System.out.print("\n" + player.getName() +", enter your number: ");
            number = scanInput.nextInt();
            if (number < 0 || number > 100) {
                System.out.println(player.getName() + ", you entered incorrect number.");
                System.out.println("It must be from 0 to 100 inclusive. \nTry again!");
            }
        } while (number < 0 || number > 100);
        player.setNumber(attemptNumber, number);

    }

    private void compareNumbers(Player player, int attemptNumber) {
        if (!isFailGuessNumberGame(player, attemptNumber)) {
            if (player.getNumber(attemptNumber) > hiddenNumber) {
                System.out.println("Entered number is more than hidden.");
            } else if (player.getNumber(attemptNumber) < hiddenNumber) {
                System.out.println("Entered number is less than hidden.");
            } else {
                System.out.println("\n!!!!!!!!!!!!!!!!\nCongratulations, " +
                        player.getName() + "! You are a winner!\n" +
                        "The hidden number is " + player.getNumber(attemptNumber) + ".\n" +
                        "!!!!!!!!!!!!!!!!\nYou guessed it on the " + attemptNumber + " attempt");
                printAttemptsNumbers(player, attemptNumber);
            }
        } else {
            printAttemptsNumbers(player, attemptNumber);
        }
    }

    private boolean isFailGuessNumberGame(Player player,  int attemptNumber) {
        boolean isFailGuessNumberGame = false;
        if (attemptNumber == 10) {
            isFailGuessNumberGame = true;
            printAttemptsNumbers(player, attemptNumber);
        }
        return isFailGuessNumberGame;
    }

    private void printAttemptsNumbers(Player player, int attemptNumber) {
        int[] number = Arrays.copyOf(player.getNumber(), attemptNumber);
        System.out.print("\n" + player.getName() + " entered thees numbers: " );
        for (int num : number) {
            System.out.print(num + " ");
        }
    }
}