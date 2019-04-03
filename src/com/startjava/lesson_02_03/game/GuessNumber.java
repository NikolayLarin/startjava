package com.startjava.lesson_02_03.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber = new Random().nextInt(100);
    private Scanner scanInput = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }    

    public void startGuessNumberGame() {
        enterPlayerNumber(playerOne);
        compareNumbers(playerOne);
        enterPlayerNumber(playerTwo);
        compareNumbers(playerTwo);
    }

    private void enterPlayerNumber(Player player) {
        int number;
        do {
            System.out.print("\n" + player.getName() +", enter your number: ");
            number = scanInput.nextInt();
            if (number < 0 || number > 100) {
                System.out.println(player.getName() + ", you entered incorrect number.");
                System.out.println("It must be from 0 to 100 inclusive. \nTry again!");
            }
        } while (number < 0 || number > 100);
        player.setNumber(number);
    }

    private void compareNumbers(Player player) {
        if (player.getNumber() > hiddenNumber) {
            System.out.println("Entered number is more than hidden.");
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println("Entered number is less than hidden.");
        } else {            
            System.out.println("\n!!!!!!!!!!!!!!!!\nCongratulations, " + player.getName() + "! You are a winner!");
            System.out.println("The hidden number is " + player.getNumber() + ".\n!!!!!!!!!!!!!!!!");
        }
    }
}