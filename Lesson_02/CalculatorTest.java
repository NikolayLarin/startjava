import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calcPure = new Calculator ();
        
        calcPure.setNum1(2);
        calcPure.setNum2(0);
        calcPure.setOperation('^');
        calcPure.calculator();
    }
}