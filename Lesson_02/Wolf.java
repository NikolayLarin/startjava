public class Wolf {

    String sex;
    String name;
    int age;
    String coloring;

    void go() {
        System.out.println("I go now.");
    }

    void sit() {
        System.out.println("I'm sitting now.");
    }

    void run() {
        System.out.println("I'm runing now.");
    }

    String howl() {
        System.out.println("Wooooo!");
        return "Woo-Woooo-ooo!";
    }

    void hunt() {
        System.out.println("I'm hunting now.");
    }
}