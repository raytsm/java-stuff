public class Caller {
    static void main() {
        startConversation();
    }

    private static void startConversation() {
        String reply = Responder.getResponse("Hello from the Caller!");
        System.out.println(reply);
    }
}

