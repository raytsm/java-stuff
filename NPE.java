import java.util.Objects;

public class NPE {
    public static void main(String[] args) {
        String someString = null;

        // throws NPE

        // CASE I : when invoking a method .length()
       // int size = someString.length();
        // use this instead
        int size = someString != null ? someString.length() : 0;

        // CASE II : comparing strings
//        if (someString.equals("abc")) {
//            System.out.println("The Same");
//        }
        // use Yoda notation instead
        if ("abc".equals(someString)) {
            System.out.println("The Same");
        }
        // if any one could be null use java.lang.Objects
        if (Objects.equals(someString, someString)) {
            System.out.println("The Same");
        }

        // Other considerations for avoiding NPE
        // - use conditional statement to check for null value for any reference types
        // - avoid assigining null whenevery possible
        // - use NPE safe feature from standart library
    }
}