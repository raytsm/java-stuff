public class RobotCO {
    public static void main(String[] args) {
        Robot andrew = new Robot("Andrew", "ND-112"); // SECOND CONSTRUCTOR CALLED
    }
}

class Robot {
    String name;
    String model;
    int lifetime;

    public Robot() {
        this.name = "Anonymous";
        this.model = "Unknown";
        this.lifetime = 0;
    }

    public Robot(String name, String model) {
        this (name, model, 20); // the calling of constructor should be the first statement
    }

    public Robot(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
        System.out.println("The third constructor is invoked.");
    }
}