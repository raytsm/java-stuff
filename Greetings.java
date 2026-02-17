public class Greetings {
    static void main() {
        String greeting = "Hello world";
        if (greeting.contains("e")) {
            greeting += "!";
            System.out.println(greeting);
        }
        System.out.println("Shutting down");
    }
}