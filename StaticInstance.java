public class StaticInstance {
    public static void main(String[] args) {
        Human.averageWorking();

        Human h1 = new Human();
        h1.name = "Joe";
        h1.age = 20;
        h1.work();

        Human h2 = new Human();
        h2.name = "Peter";
        h2.age = 19;
        h2.work();
        h2.worksTogetherWith(h1);
    }
}

class Human {
    String name;
    int age;

    public static void averageWorking() {
        System.out.println("An Average human work 40 hours per week.");
    }

    public void work() {
        System.out.println(this.name + " loves working");
    }

    public void worksTogetherWith(Human other) {
        System.out.println(this.name + " loves together with " + other.name + '!');
    }
}