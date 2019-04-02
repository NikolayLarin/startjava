import java.util.Random;

public class GuessNumber {

    private Random newRandom = new Random();
    private int hiddenNumber = newRandom.nextInt(101);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }    

    public void startGuessNumberGame() {
        playerOne.setPlayerNumber(playerOne.getPlayerName());
        checkNumberVsHidden(playerOne.getPlayerName(), playerOne.getPlayerNumber());
        playerTwo.setPlayerNumber(playerTwo.getPlayerName());
        checkNumberVsHidden(playerTwo.getPlayerName(), playerTwo.getPlayerNumber());
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