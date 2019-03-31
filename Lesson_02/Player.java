import java.util.Scanner;

public class Player {

    private String playerName;
    private int playerNumber;
    private Scanner scanInput = new Scanner(System.in);
    
    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerNumber(String playerName) {
        this.playerName = playerName;
        do {
            System.out.print("\n" + playerName +", enter your number: ");
            playerNumber = scanInput.nextInt();
            if (playerNumber < 0 | playerNumber > 100) {
            System.out.println(playerName + ", you entered incorrect number.");
            System.out.println("It must be from 0 to 100 inclusive. \nTry again!");
            }
        } while (playerNumber < 0 | playerNumber > 100);
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
