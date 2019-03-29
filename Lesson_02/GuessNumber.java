import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Random random0_100 = new Random();
    private int hiddenNumber = random0_100.nextInt(101);
    private Scanner scanInput = new Scanner(System.in);
    private int playerOneNumber;
    private int playerTwoNumber;

    public GuessNumber(String playerOneName, String playerTwoName) {
        char userChoice;
        do {
            playerOneNumber = setPlayerNumber(playerOneName);
            numberVersusHidden(playerOneName, playerOneNumber);
            playerTwoNumber = setPlayerNumber(playerTwoName);
            numberVersusHidden(playerTwoName, playerTwoNumber);
            do {
                System.out.print("\nDo you want to continue? (Y/N): ");
                userChoice = scanInput.next().charAt(0);
            } while (userChoice != 'Y' && userChoice != 'N');
        } while (userChoice == 'Y');
    }

    private int setPlayerNumber(String playerName) {
        int playerNumber;
        do {
            System.out.print("\n" + playerName +", enter your number: ");
            playerNumber = scanInput.nextInt();
                if (playerNumber < 0 | playerNumber > 100) {
                    System.out.println("You entered incorrect number. \nIt must be from 0 to 100. \nTry again!");
                }
        } while (playerNumber < 0 | playerNumber > 100);
        return playerNumber;
    }

    private void numberVersusHidden(String playerName, int playerNumber) {
        if (playerNumber > hiddenNumber) {
            System.out.println("Entered number is more than hidden.");
        } else if (playerNumber < hiddenNumber) {
            System.out.println("Entered number is less than hidden.");
        } else {            
            System.out.println("\n!!!!!!!!!!!!!!!!\nCongratulations, " + playerName + "! You are a winner!");
            System.out.println("The hidden number is " + playerNumber + ".\n!!!!!!!!!!!!!!!!");
        }
    }
}