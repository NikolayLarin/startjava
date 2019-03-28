public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jipsyAvenger = new Jaeger();
        jipsyAvenger.setModelName("Gipsy Avenger");
        jipsyAvenger.setMarkType("Mark-5");
        jipsyAvenger.setOrigin("Japan");
        jipsyAvenger.setHeight(81.77f);
        jipsyAvenger.setWeight(2004);
        jipsyAvenger.setSpeed(8);
        jipsyAvenger.setStrength(12);
        jipsyAvenger.setArmor(7);
        
        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMarkType("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.2f);
        crimsonTyphoon.setWeight(1722);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(15);

        System.out.println("\n" + "The first jaeger's model name is " + jipsyAvenger.getModelName() + ".");
        System.out.println("It's a " + jipsyAvenger.getMarkType() + ".");
        System.out.println("It has a " + jipsyAvenger.getHeight() + " meters height");
        System.out.println("and " + jipsyAvenger.getWeight() + " tons weight." + "\n");
        System.out.println("Basic specifications of the " + jipsyAvenger.getModelName() + " is:");
        System.out.println("Speed:    " + jipsyAvenger.getSpeed());
        System.out.println("Strength: " + jipsyAvenger.getStrength());
        System.out.println("Armor:    " + jipsyAvenger.getArmor() + "\n");

        System.out.println("\n" + "The secomd jaeger's model name is " + crimsonTyphoon.getModelName() + ".");
        System.out.println("It's a " + crimsonTyphoon.getMarkType() + ".");
        System.out.println("It has a " + crimsonTyphoon.getHeight() + " meters height");
        System.out.println("and " + crimsonTyphoon.getWeight() + " tons weight." + "\n");
        System.out.println("Basic specifications of the " + crimsonTyphoon.getModelName() + " is:");
        System.out.println("Speed:    " + crimsonTyphoon.getSpeed());
        System.out.println("Strength: " + crimsonTyphoon.getStrength());
        System.out.println("Armor:    " + crimsonTyphoon.getArmor() + "\n");

        System.out.println("The usual sequence of jaeger's actions is:");
        do {
            jipsyAvenger.scanKaiju();
            jipsyAvenger.go();
            jipsyAvenger.run();
            jipsyAvenger.fly();
            jipsyAvenger.swim();            
        } while (jipsyAvenger.destroyKaiju() != true);
    }
}