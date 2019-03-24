public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfGrey = new Wolf();
        wolfGrey.setSex("male");
        wolfGrey.setName("Fast");
        wolfGrey.setAge(7);
        wolfGrey.setColoring("grey");
        
        System.out.println("\n" + "This wolf's name is " + wolfGrey.getName() + ".");
        System.out.println("It's a " + wolfGrey.getSex() + ".");
        System.out.println("It has a " + wolfGrey.getColoring() + " coloring.");
        System.out.println("This wolf is " + wolfGrey.getAge() + " years old." + "\n");

        wolfGrey.howl();
        wolfGrey.go();
        wolfGrey.sit();
        wolfGrey.run();
        wolfGrey.hunt();
        System.out.println("I howl: " + wolfGrey.howl() + "\n");
    }
}