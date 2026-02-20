public class InitBlock {
    static void main() {
        KindInitBlock kk = new KindInitBlock();
        kk.print();
    }
}

class KindInitBlock {
    final static int someVar;
    static String someVar1;

    private int[] array;

    // static initialization block
    static {
        someVar = 0;
        someVar1 = "Some string";
    }

    // instance initialization block
    {
        System.out.println("Instance Initialization Block before Constructor");

        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

    }
    // can have multiple initialization block which will run in order it appears

    public void print() {
        for (int ar: array) {
            System.out.print(ar + " ");
        }
    }
}