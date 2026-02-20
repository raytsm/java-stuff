public class PatientC {
    static void main() {
        PatientConstructorDemo john = new PatientConstructorDemo("john", 20, 190.8f);
        System.out.println(john.age);
    }
}

class PatientConstructorDemo {
    String name;
    int age;
    float height;

    PatientConstructorDemo(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}