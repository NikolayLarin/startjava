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
        playerOne.setPlayerNumber(enterPlayerNumber(playerOne.getPlayerName()));
        compareNumbers(playerOne.getPlayerName(), playerOne.getPlayerNumber());
        playerTwo.setPlayerNumber(enterPlayerNumber(playerTwo.getPlayerName()));
        compareNumbers(playerTwo.getPlayerName(), playerTwo.getPlayerNumber());
    }

    private int enterPlayerNumber(String playerName) {
        int playerNumber;
        do {
            System.out.print("\n" + playerName +", enter your number: ");
            playerNumber = scanInput.nextInt();
            if (playerNumber < 0 | playerNumber > 100) {
            System.out.println(playerName + ", you entered incorrect number.");
            System.out.println("It must be from 0 to 100 inclusive. \nTry again!");
            }
        } while (playerNumber < 0 | playerNumber > 100);
        return playerNumber;
    }

    private void compareNumbers(String playerName, int playerNumber) {
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