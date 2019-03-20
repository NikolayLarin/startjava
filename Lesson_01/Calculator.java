public class Calculator {
    public static void main(String[] args) {

        int a = 28;
        int b = 13;        
        char plus = '+';
        char minus = '-';
        char multiply = '*';
        char divide = '/';
        char aPower3 = '^';
        char remainder = '%';
        char noOperations = 'Y';

        if (plus == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } 

        if (minus == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } 

        if (multiply == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        }

        if (divide == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        }

        if (aPower3 == '^') {
            System.out.println(a + "^3 " + " = " + (a * a * a));
        }

        if (remainder == '%') {
            System.out.println("The remainder of dividing " + a + " / " + b + " = " + (a % b));
        } 

        if (noOperations == 'Y') {
            System.out.println("No operations applied on a & b.");
        }        
    }
}