// 3 use of keywork super
// - accessing fields with same or different name super.fieldName kinda like this.fieldName
// - invoking methods of super class
// - invoke constructor of super class

public class SuperClass {
    public SuperClass() {
        System.out.println("inside SuperClass");
    }
    protected int field;

    protected int getField() {
        return field;
    }

    protected void printBaseValue() {
        System.out.println(field);
    }

    static void main() {
        SubClass subClass = new SubClass();
        subClass.printSubValue();
    }
}

class SubClass extends SuperClass {
    protected int field;

    public SubClass() {

        super(); // invoking constructor of superclass should be the first statement or code won't compile

        this.field = 30; // field of Subclass
        field = 20; // still field of subclass
        super.field = 30; // access and set field of superclass
    }

    public void printSubValue() {
        super.printBaseValue(); // super is optional but invokes methods from super class
        System.out.println(field);
    }
}

