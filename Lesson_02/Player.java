import java.util.Scanner;

public class Player {

    private String playerName;
    private int playerNumber;
    private Scanner scanInput = new Scanner(System.in);
    
    public Player(String playerName) {
        this.playerName = playerName;
        System.out.println("Hallo, " + playerName + "!");
    }
}