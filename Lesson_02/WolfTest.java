public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfGrey = new Wolf();
        wolfGrey.sex = "male";
        wolfGrey.name = "Fast";
        wolfGrey.age = 7;
        wolfGrey.coloring = "gray";
        
        System.out.println("\n" + "This wolf's name is " + wolfGrey.name + ".");
        System.out.println("It's a " + wolfGrey.sex + ".");
        System.out.println("It has a " + wolfGrey.coloring + " coloring.");
        System.out.println("This wolf is " + wolfGrey.age + " years old." + "\n");

        wolfGrey.howl();
        wolfGrey.go();
        wolfGrey.sit();
        wolfGrey.run();
        wolfGrey.hunt();
        System.out.println("I howl: " + wolfGrey.howl() + "\n");
    }
}