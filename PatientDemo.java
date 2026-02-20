public class PatientDemo {
    static void main() {
        Patient andrew  = new Patient();

        andrew.name = "Andrew";
        andrew.age = 20;
        andrew.height=180;

        System.out.println("Name: " + andrew.name + " Age: " + andrew.age + " Height: " + andrew.height);

        Patient john = new Patient();

        john.name = "John";
        john.age = 22;
        john.height=190;

        System.out.println("Name: " + john.name + " Age: " + john.age + " Height: " + john.height);

        // Classes are reference types and more than one variable can point to same object reference
        Patient p = john;
        System.out.println("Name: " + p.name + " Age: " + p.age + " Height: " + p.height);

        // modifying one variable changes another's variable data since both refer to same address in heap memory
        john.age = 23;
        System.out.println(p.age);
    }
}

class Patient {
    String name;
    int age;
    float height;
}