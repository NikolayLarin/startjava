import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("\nWelcome to the \"Guess numer\" game!");
        System.out.println("The game needs two players to play.");

        System.out.print("\nEnter first player name: ");
        String playerOneName = scanInput.next();
        Player playerOne = new Player(playerOneName);

        System.out.print("\nEnter second player name: ");
        String playerTwoName = scanInput.next();
        Player playerTwo = new Player(playerTwoName);
        GuessNumber gameForTwo = new GuessNumber(playerOneName, playerTwoName);
    }
}