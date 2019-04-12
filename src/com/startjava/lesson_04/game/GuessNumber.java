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
    private boolean isWin;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGuessNumberGame() {
        initStart();
        while (attemptNumber <= 10 && !isWin) {
            enterPlayerNumber(playerOne);
            compareNumbers(playerOne);
            enterPlayerNumber(playerTwo);
            compareNumbers(playerTwo);
            attemptNumber++;
        }
    }

    private void initStart() {
        hiddenNumber = new Random().nextInt(100);
        attemptNumber = 1;
        isWin = false;
    }

    private void enterPlayerNumber(Player player) {
        int number;
        do {
            number = enterNumber(player);
        } while (!isValidNumber(player, number));
        player.setNumber(attemptNumber, number);
    }

    private int enterNumber(Player player) {
        System.out.print("\n" + player.getName() +", it's your " + attemptNumber +
                " attempt, enter your number: ");
        return scanInput.nextInt();
    }

    private boolean isValidNumber(Player player, int number) {
        if (number < 0 || number > 100) {
            System.out.println(player.getName() + ", you entered incorrect number.");
            System.out.println("It must be from 0 to 100 inclusive. \nTry again!");
            return false;
        }
        return true;
    }

    private void compareNumbers(Player player) {
        if (player.getNumber(attemptNumber) > hiddenNumber) {
            System.out.println("Entered number is more than hidden.");
        } else if (player.getNumber(attemptNumber) < hiddenNumber) {
            System.out.println("Entered number is less than hidden.");
        } else {
            System.out.println("\n!!!!!!!!!!!!!!!!\nCongratulations, " +
                    player.getName() + "! You are a winner!\n" +
                    "The hidden number is " + player.getNumber(attemptNumber) + ".\n" +
                    "!!!!!!!!!!!!!!!!\nYou guessed it on the " + attemptNumber + " attempt");
            isWin = true;
            finishGame(player);
        }
        if (attemptNumber == 10) {
            System.out.print("\nPlayer " + player.getName() + "'s attempts ended!");
            finishGame(player);
        }
    }

    private void finishGame(Player player) {
        printAllAttempts(player);
        setInitialConditions(player);
    }

    private void printAllAttempts(Player player) {
        int[] numbers = player.getNumbers(attemptNumber);
        System.out.println("\n" + player.getName() + " entered these numbers: " );
        System.out.println(Arrays.toString(numbers));
    }

    private void setInitialConditions(Player player) {
        player.setInitialConditions(attemptNumber);
    }
}