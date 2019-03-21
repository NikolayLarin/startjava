public class Cycle {

    public static void main(String[] args) {
        System.out.println ();        
        for (short i = 0; i <= 20; i++) {
            System.out.print (i +"; ");
            if (i == 12){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

        int i = -6;
        while (i <= 6){
            System.out.print(i + "; ");
            i = i + 2;
        }
        System.out.println();
        System.out.println();

        int j = 10;
        int a = 0;
        System.out.print("The sum of such odd numbers ");
        do {                    
            if (j % 2 !=0) {
                a += j;                
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 20);
        System.out.println ();
        System.out.println("is " + a);
        System.out.println ();
    }
}