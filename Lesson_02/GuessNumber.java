import java.util.Random;

public class GuessNumber {

    private Random random0_100 = new Random();
    private int hiddenNumber = random0_100.nextInt(101);

    public void guessNumber(String playerName, int inputNumber) {
        if (inputNumber > hiddenNumber) {
            System.out.println("Entered number is more than hidden.");
        } else if (inputNumber < hiddenNumber) {
            System.out.println("Entered number is less than hidden.");
        } else {            
            System.out.println("\n!!!!!!!!!!!!!!!!\nCongratulations, " + playerName + "! You are a winner!");
            System.out.println("The hidden number is " + inputNumber + ".\n!!!!!!!!!!!!!!!!");
        }
    }
}