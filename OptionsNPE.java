import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class OptionsNPE  {
    static {
        System.out.println("inside static ");
    }
    public OptionsNPE() {}

    public static void main(String[] args) {

        Set<String> str = Set.of("hello", "world");
        System.out.println(str.getClass().getName()); // gives name of implementation for Set.of()


        Optional<String> absent = Optional.empty();
        Optional<String> present = Optional.of("Hello");

        System.out.println(absent.isPresent());
        System.out.println(present.isPresent());

        // passing null to Optional.of(); gives NPE so use Optional.ofNullable();
        String message = null;
        Optional<String> optMessage = Optional.ofNullable(message);

        System.out.println(optMessage.isPresent());

        // Getting value from Optional
        // get, orElse, orElseGet
        Optional<String> optName = Optional.of("John");
        String name = optName.get();
        String name1 = Optional.ofNullable(name).orElse("unknown"); // if name is empty use "unknown"

//        String name2 = Optional.ofNullable(name).orElseGet(SomeClass::GetDefaultResult);

        // Conditional action : ifPresent, ifPresentOrElse
        Optional<String> companyName = Optional.of("Google");
        companyName.ifPresent((n) -> System.out.println(n.length())); // 6

        Optional<String> noName = Optional.empty();
        noName.ifPresent((n) -> System.out.println(n.length())); // doesn't print anything NPE safe just like if condition check for null

        companyName.ifPresentOrElse(
                (na) -> System.out.println(na.length()), // if present prints length
                () -> System.out.println(0) // else fallback function prints 0
        );



    }
}