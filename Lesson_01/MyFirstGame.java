public class MyFirstGame {

    public static void main(String[] args) {
        byte a = 65;        
        byte hiddenNumber = 61;

        while (a != hiddenNumber) {
            if (a > hiddenNumber) {
                System.out.println("Entered number is more than hidden.");
                a-=1;
            } else if (a < hiddenNumber) {
                System.out.println("Entered number is less than hidden.");
                a+=1;
            }                        
        }
        System.out.println("Congratulations! You guessed!");
        System.out.println("The hidden number is " + a + ".");
    }
}