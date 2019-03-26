import java.util.Scanner;

// This class requires you to make a choice:
// continue (Y) or not (N) until you enter exactly "Y" or "N".
//It's returns a boolean value "true" if choice is "Y"
// or value "false" if choice is "N".

public class ChooseOneYorN {

    private Scanner scanYorN = new Scanner(System.in);
    private boolean isPresentYorN;
    private boolean isCountAgain = false;
    private String countAgain;

    public boolean chooseOneYorN() {
        isPresentYorN = false;
        while (isPresentYorN == false) {
            System.out.print("Do you want to continue? (Y/N): ");
            countAgain = scanYorN.next();
            switch (countAgain) {
                case "Y":
                    isPresentYorN = true;
                    isCountAgain = true;
                    break;
                case "N":
                    isPresentYorN = true;
                    isCountAgain = false;
                    break;
                default:
                    isPresentYorN = false;
                    isCountAgain = false;
                    break;
            }
        }
        return isCountAgain;
    }
}