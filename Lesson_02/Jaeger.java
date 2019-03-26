// It's a robot's class for https://pacificrim.fandom.com/wiki/Category:Jaegers

public class Jaeger {

    private String modelName;
    private String markType;
    private String origin;
    private float height; // meters
    private float weight; // tons
    private int speed;
    private int strength;
    private int armor;

    public void setModelName(String modelName) {
            this.modelName = modelName;
    }

    public String getModelName() {
            return modelName;
    }

    public void setMarkType(String markType) {
        if (markType == "Mark-4" || markType == "Mark-6") {
            this.modelName = modelName;
        } else {
            System.out.println("Incorrect Mark! Use only Mark-2 or Mark-7 Jaeger types.");
        }        
    }

    public String getMarkType() {
            return markType;
    }

    public void setOrigin(String origin) {
            this.origin = origin;
    }

    public String getOrigin() {
            return origin;
    }

    public void setHeight(float height) {
        if (height >= 75f && height <= 82f) {
            this.height = height;
        } else {
            System.out.println("Incorrect height! It mast be from 55.5 to 80.5 meters only.");
        }
    }

    public float getHeight() {
            return height;
    }

    public void setWeight(float weight) {
        if (weight >= 1700f && weight <= 2100f) {
            this.weight = weight;
        } else {
            System.out.println("Incorrect weight! It mast be from 1690 to 2510 tons only.");
        }
    }

    public float getWeight() {
            return weight;
    }

    public void setSpeed(int speed) {
        if (speed >= 2 && speed <= 10) {
            this.speed = speed;
        } else {
            System.out.println("Incorrect speed! It mast be from 2 to 10 units only.");
        }
    }

    public int getSpeed() {
            return speed;
    }

    public void setStrength(int strength) {
        if (strength >= 3 && strength <= 10) {
            this.strength = strength;
        } else {
            System.out.println("Incorrect strength! It mast be from 3 to 10 units only.");
        }
    }

    public int getStrength() {
            return strength;
    }
   
    public void setArmor(int armor) {
        if (armor >= 5 && armor <= 10) {
            this.armor = armor;
        } else {
            System.out.println("Incorrect armor! It mast be from 5 to 10 units only.");
        }
    }

    public int getArmor() {
            return armor;
    }

    public void go() {
        System.out.println("I go now.");
    }

    public void fly() {
        System.out.println("I'm flying now.");
    }

    public void run() {
        System.out.println("I'm runing now.");
    }

    public void swim() {
        System.out.println("I'm swimming now.");
    }    

    public String scanKaiju() {
        System.out.println("I found a Kaiju!");
        return "And I'll destroy the enemy!";
    }

    public boolean destroyKaiju() {
        System.out.println("I destroyed the Kaiju!");
        return true;
    }
}