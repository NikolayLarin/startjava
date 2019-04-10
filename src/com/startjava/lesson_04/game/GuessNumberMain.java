package com.startjava.lesson_04.game;

import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("\nWelcome to the \"Guess number\" game!\n" +
                "The game needs two players to play.\n\n" +
                "ATTENTION!\nYou have 10 attempts to guess the number in the game!\n\n" +
                "Enter first player name: ");
        Player playerOne = new Player(scanInput.next());
        System.out.print("Hallo, " + playerOne.getName() + "!\n" +
                "Enter second player name: ");
        Player playerTwo = new Player(scanInput.next());
        System.out.println("Hallo, " + playerTwo.getName() + "!");
        GuessNumber gameForTwo = new GuessNumber(playerOne, playerTwo);

        String userChoice;
        do {
            gameForTwo.startGuessNumberGame();
            do {
                System.out.print("\nDo you want to continue? (Y/N): ");
                userChoice = scanInput.next();
            } while (!userChoice.equals("Y") && !userChoice.equals("N"));
        } while (userChoice.equals("Y"));
    }
}