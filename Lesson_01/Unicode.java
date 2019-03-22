public class Unicode {

    public static void main(String[] args) {
        char startOutput = 33;
        for (int i = 33; i <= 126; i++) {
            System.out.println("Unicode symbol " + i + " is:  " + startOutput);
            startOutput++;
        }
        
        System.out.println("\n" + "Some Unicode cyrillic characters:" + "\n");
        startOutput = 1025;
        for (int i = 1025; i <= 1111; i++) {
            System.out.print(startOutput + " ");
            startOutput++;
        }
        System.out.println();
    }
}