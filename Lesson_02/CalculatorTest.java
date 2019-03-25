import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcPure = new Calculator();
        Scanner scanEnter = new Scanner(System.in);
        boolean isCountAgain = true;
        boolean isPresentYorN = false;
        String countAgain;


        while (isCountAgain == true) {
            System.out.print("Enter first number: ");
            calcPure.setNum1(scanEnter.nextInt());
            System.out.print("Enter math operation (+, -, *, /, ^, %): ");
            calcPure.setOperation(scanEnter.next());
            System.out.print("Enter second number: ");
            calcPure.setNum2(scanEnter.nextInt());
            calcPure.calculator();            
            while (isPresentYorN == false) { 
                System.out.println("Do you want to continue? (Y/N): ");
                countAgain = scanEnter.next();
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
                        break;
                }
            }
        }
    }
}