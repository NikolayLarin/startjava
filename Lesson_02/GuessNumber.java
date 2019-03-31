import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Random newRandom = new Random();
    private int hiddenNumber = newRandom.nextInt(101);
    private Scanner scanInput = new Scanner(System.in);
    private String playerOneName, playerTwoName;
    private int playerOneNumber, playerTwoNumber;
    private Player playerOne = new Player(playerOneName);
    private Player playerTwo = new Player(playerTwoName);

    public GuessNumber(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public void startGuessNumberGame() {
        playerOne.setPlayerNumber(playerOneName);
        checkNumberVsHidden(playerOneName, playerOne.getPlayerNumber());
        playerTwo.setPlayerNumber(playerTwoName);
        checkNumberVsHidden(playerTwoName, playerTwo.getPlayerNumber());
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