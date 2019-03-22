public class Cycle {

    public static void main(String[] args) {      
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + "; ");
            if (i == 12) {
                System.out.println();
            }
        }
        System.out.println("\n");

        int i = -6;
        while (i <= 6) {
            System.out.print(i + "; ");
            i += 2;
        }
        System.out.println("\n");

        int rangeStart = 10;
        int sumOddNumbers = 0;
        System.out.print("The sum of such odd numbers: ");
        do {                    
            if (rangeStart % 2 != 0) {
                sumOddNumbers += rangeStart;                
                System.out.print(rangeStart + "; ");
            }
            rangeStart++;
        } while (rangeStart <= 20);
        System.out.println();
        System.out.println("is " + sumOddNumbers + "\n");
    }
}