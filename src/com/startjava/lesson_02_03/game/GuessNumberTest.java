package com.startjava.lesson_02_03.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("\nWelcome to the \"Guess number\" game!");
        System.out.println("The game needs two players to play.");

        System.out.print("\nEnter first player name: ");
        Player playerOne = new Player(scanInput.next());
        System.out.println("Hallo, " + playerOne.getName() + "!");

        System.out.print("\nEnter second player name: ");
        Player playerTwo = new Player(scanInput.next());
        System.out.println("Hallo, " + playerTwo.getName() + "!");

        GuessNumber gameForTwo = new GuessNumber(playerOne, playerTwo);
//        char userChoice;
//        do {
//            gameForTwo.startGuessNumberGame();
//            do {
//                System.out.print("\nDo you want to continue? (Y/N): ");
//                userChoice = scanInput.next().charAt(0);
//            } while (userChoice != 'Y' && userChoice != 'N');
//        } while (userChoice == 'Y');

        String userChoice;
        do {
            gameForTwo.startGuessNumberGame();
            do {
                System.out.print("\nDo you want to continue? (Y/N): ");
                userChoice = scanInput.nextLine();
            } while (!userChoice.equals("Y") && !userChoice.equals("N"));
        } while (userChoice.equals("Y"));
    }
}