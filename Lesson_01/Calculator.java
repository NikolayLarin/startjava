public class Calculator {

    public static void main(String[] args) {
        int a = 28;
        int b = 13;
        short power = 2;
        char operation = '^'; // Choose operation: +, -, *. /, ^, %

        if (operation == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (operation == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (operation == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (operation == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (operation == '^') {
            long result = a;
            for (short i = 1; i < power; i++) {
                result = result * a;
            }                
            System.out.println(a + "^" + power + " = " + result);
        } else if (operation == '%') {
            System.out.println("The remainder of dividing " + a + " / " + b + " = " + (a % b));
        } else {
            System.out.println("No operations applied on a & b.");
        }
    }
}