import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Random random0_100 = new Random();
    private int hiddenNumber = random0_100.nextInt(101);
    private Scanner scanInput = new Scanner(System.in);

    public GuessNumber(String playerOneName, String playerTwoName) {
        Player playerOne = new Player(playerOneName, 0);
        Player playerTwo = new Player(playerTwoName, 0);
        char userChoice;
        do {
            playerOne.setPlayerNumber(playerOneName);
            checkNumberVsHidden(playerOneName, playerOne.getPlayerNumber());
            playerTwo.setPlayerNumber(playerTwoName);
            checkNumberVsHidden(playerTwoName, playerTwo.getPlayerNumber());
            do {
                System.out.print("\nDo you want to continue? (Y/N): ");
                userChoice = scanInput.next().charAt(0);
            } while (userChoice != 'Y' && userChoice != 'N');
        } while (userChoice == 'Y');
    }

    private void checkNumberVsHidden(String playerName, int playerNumber) {
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