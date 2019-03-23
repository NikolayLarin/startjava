public class Person {

    String sex = "male";
    String name = "Victor";
    float height = 1.78f;
    float weight = 88.6f;
    int age = 39;

    void go() {
        System.out.println("I go.");
    }

    void sit() {
        System.out.println("I'm sitting.");
    }

    void run() {
        System.out.println("I'm runing.");
    }

    String speak() {
        return "I'm talking now.";
    }

    boolean learnJava() {
        System.out.println("Yes, I'm learning Java now.");
        return true;
    }
}