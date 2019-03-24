public class Wolf {

    private String sex;
    private String name;
    private int age;
    private String coloring;

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColoring() {
        return coloring;
    }

    public void setSex(String sex) {
        if (sex == "male" || sex == "shemale") {
            this.sex = sex;
        } else {
            System.out.println("Incorrect sex, try again.");
            System.exit(0);         
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 8 || age <= 0) {
            System.out.println("Incorrect age, try again.");
            System.exit(0);
        } else {
            this.age = age;
        }
    }

    public void setColoring(String coloring) {
        this.coloring = coloring;
    }

    public void go() {
        System.out.println("I go now.");
    }

    public void sit() {
        System.out.println("I'm sitting now.");
    }

    public void run() {
        System.out.println("I'm runing now.");
    }

    public String howl() {
        System.out.println("Wooooo!");
        return "Woo-Woooo-ooo!";
    }

    public void hunt() {
        System.out.println("I'm hunting now.");
    }
}