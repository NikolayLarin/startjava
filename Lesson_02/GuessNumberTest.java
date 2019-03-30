import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("\nWelcome to the \"Guess number\" game!");
        System.out.println("The game needs two players to play.");

        System.out.print("\nEnter first player name: ");
        String playerOneName = scanInput.next();
        Player playerOne = new Player(playerOneName, 0);
        System.out.println("Hallo, " + playerOneName + "!");

        System.out.print("\nEnter second player name: ");
        String playerTwoName = scanInput.next();
        Player playerTwo = new Player(playerTwoName, 0);
        System.out.println("Hallo, " + playerTwoName + "!");
        GuessNumber gameForTwo = new GuessNumber(playerOneName, playerTwoName);
    }
}