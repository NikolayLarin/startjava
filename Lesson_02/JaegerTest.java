public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMarkType("Mark-5");
        jaegerOne.setOrigin("Japan");
        jaegerOne.setHeight(81.77f);
        jaegerOne.setWeight(2004);
        jaegerOne.setSpeed(8);
        jaegerOne.setStrength(12);
        jaegerOne.setArmor(7);
        
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Crimson Typhoon");
        jaegerTwo.setMarkType("Mark-4");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1722);
        jaegerTwo.setSpeed(9);
        jaegerTwo.setStrength(8);
        jaegerTwo.setArmor(15);

        System.out.println("\n" + "The first jaeger's model name is " + jaegerOne.getModelName() + ".");
        System.out.println("It's a " + jaegerOne.getMarkType() + ".");
        System.out.println("It has a " + jaegerOne.getHeight() + " meters height");
        System.out.println("and " + jaegerOne.getWeight() + " tons weight." + "\n");
        System.out.println("Basic specifications of the " + jaegerOne.getModelName() + " is:");
        System.out.println("Speed:    " + jaegerOne.getSpeed());
        System.out.println("Strength: " + jaegerOne.getStrength());
        System.out.println("Armor:    " + jaegerOne.getArmor() + "\n");

        System.out.println("\n" + "The secomd jaeger's model name is " + jaegerTwo.getModelName() + ".");
        System.out.println("It's a " + jaegerTwo.getMarkType() + ".");
        System.out.println("It has a " + jaegerTwo.getHeight() + " meters height");
        System.out.println("and " + jaegerTwo.getWeight() + " tons weight." + "\n");
        System.out.println("Basic specifications of the " + jaegerTwo.getModelName() + " is:");
        System.out.println("Speed:    " + jaegerTwo.getSpeed());
        System.out.println("Strength: " + jaegerTwo.getStrength());
        System.out.println("Armor:    " + jaegerTwo.getArmor() + "\n");

        System.out.println("The usual sequence of jaeger's actions is:");
        do {
            jaegerOne.scanKaiju();
            jaegerOne.go();
            jaegerOne.run();
            jaegerOne.fly();
            jaegerOne.swim();            
        } while (jaegerOne.destroyKaiju() != true);
    }
}