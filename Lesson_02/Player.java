import java.util.Scanner;

public class Player {

    private String playerName;
    private int playerNumber;
    private Scanner scanInput = new Scanner(System.in);

    public void player() {
        playerName = scanInput.next();
        System.out.println("Hallo, " + playerName + "!");
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int setPlayerNumber() {
        do {
            System.out.print("\n" + playerName +", enter your number: ");
            playerNumber = scanInput.nextInt();
                if (playerNumber < 0 | playerNumber > 100) {
                    System.out.println("You entered incorrect number. \nIt must be from 0 to 100. \nTry again!");
                }
        } while (playerNumber < 0 | playerNumber > 100);
        this.playerNumber = playerNumber;
        return playerNumber;
    }
}