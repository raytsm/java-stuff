public record RecordUser(Name name, String password) {
    static void main() {
        User alice = new User(new Name("Alice", "Smith"), "ladiuhfa");
        if (alice instanceof User(Name(String firstName, String lastName), String password)) {
            System.out.println(firstName + " " + lastName);
        }
        User.printUser(null);
    }

}

record Name(String firstName, String lastName) {}

record User (Name name, String password) {
    public String username() {
        return name.toString();
    }
    static void printUser(User obj) {
        switch(obj) {
            case User(Name(String firstName, String lastName), String password) -> System.out.println(firstName + lastName);
            case null -> System.out.println("null");
        }
    }
}