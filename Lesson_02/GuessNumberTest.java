import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        GuessNumber gameForTwo = new GuessNumber();
        Player player = new Player();     
        int playerOneNumber;
        int playerTwoNumber;
        char userChoice;
        
        System.out.println("\nWelcome to the \"Guess numer\" game!");
        System.out.println("The game needs two players to play.");
        System.out.print("\nEnter first player name: ");
        player.player();
        String playerOneName = player.getPlayerName();
        System.out.print("\nEnter second player name: ");
        player.player();
        String playerTwoName = player.getPlayerName();

        do {
            player.setPlayerName(playerOneName);
            playerOneNumber = player.setPlayerNumber();
            gameForTwo.guessNumber(playerOneName, playerOneNumber);
            player.setPlayerName(playerTwoName);
            playerTwoNumber = player.setPlayerNumber();
            gameForTwo.guessNumber(playerTwoName, playerTwoNumber);
            do  {
                System.out.print("\nDo you want to continue? (Y/N): ");
                userChoice = scanInput.next().charAt(0);
            } while (userChoice != 'Y' && userChoice != 'N');
        } while (userChoice == 'Y');      
    }
}