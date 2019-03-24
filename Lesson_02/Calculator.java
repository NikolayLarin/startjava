public class Calculator {


    private int num1;
    private int num2;
    private char operation; // Choose operation: +, -, *. /, ^, %

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;

    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculator() {
    switch (operation) {
        case '+':
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
        case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
        case '*':
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
        case '/':
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
        case '^':
            long result = 1;
            if (num2 > 0) {
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }                
            }
            System.out.println(num1 + "^" + num2 + " = " + result);
            break;
        default:
            System.out.println("No operations applied on numbers");
            break;
        }
    }

}