package com.startjava.lesson_04.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Scanner scanInput = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int attemptNumber;
    private boolean isWinnerPresent;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGuessNumberGame() {
        hiddenNumber = new Random().nextInt(100);
        attemptNumber = 1;
        isWinnerPresent = false;
        while (attemptNumber <= 10 && !isWinnerPresent) {
            enterPlayerNumber(playerOne);
            compareNumbers(playerOne);
            enterPlayerNumber(playerTwo);
            compareNumbers(playerTwo);
            attemptNumber++;
        }
    }

    private void enterPlayerNumber(Player player) {
        int number;
        do {
            System.out.print("\n" + player.getName() +", it's your " + attemptNumber +
                    " attempt, enter your number: ");
            number = scanInput.nextInt();
            if (number < 0 || number > 100) {
                System.out.println(player.getName() + ", you entered incorrect number.");
                System.out.println("It must be from 0 to 100 inclusive. \nTry again!");
            }
        } while (number < 0 || number > 100);
        player.setNumber(attemptNumber, number);

    }

    private void compareNumbers(Player player) {
        if (attemptNumber <= 10) {
                                                            System.out.println(hiddenNumber);
            if (player.getNumber(attemptNumber) > hiddenNumber) {
                System.out.println("Entered number is more than hidden.");
            } else if (player.getNumber(attemptNumber) < hiddenNumber) {
                System.out.println("Entered number is less than hidden.");
            } else {
                System.out.println("\n!!!!!!!!!!!!!!!!\nCongratulations, " +
                        player.getName() + "! You are a winner!\n" +
                        "The hidden number is " + player.getNumber(attemptNumber) + ".\n" +
                        "!!!!!!!!!!!!!!!!\nYou guessed it on the " + attemptNumber + " attempt");
                this.isWinnerPresent = true;
                finishGame(player);
            }
        }
        if (attemptNumber == 10) {
            System.out.print("\nPlayer " + player.getName() + "'s attempts ended!");
            finishGame(player);
        }
    }

    private void finishGame(Player player) {
        printAttemptsNumbers(player);
        setInitialConditions(player);
    }

    private void printAttemptsNumbers(Player player) {
        int[] number = Arrays.copyOf(player.getNumber(), attemptNumber);
        System.out.println("\n" + player.getName() + " entered these numbers: " );
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void setInitialConditions(Player player) {
        for (int i = 1; i <= attemptNumber; i++) {
            player.setNumber(i, 0);
        }
    }
}