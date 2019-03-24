public class Wolf {

    private String sex;
    private String name;
    private int age;
    private String coloring;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex == "male" || sex == "shemale") {
            this.sex = sex;
        } else {
            System.out.println("Incorrect sex, try again.");
        }
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8 || age <= 0) {
            System.out.println("Incorrect age, try again.");            
        } else {
            this.age = age;
        }
    }

    public String getColoring() {
        return coloring;
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