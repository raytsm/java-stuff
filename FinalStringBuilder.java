public class FinalStringBuilder  {
	public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder();

        // reassigning doesn't work because of final
       // stringBuilder = new StringBuilder();

        // .append works because it changes the internal state and not the object inside variable itself
        stringBuilder.append("Hello");

        System.out.println(stringBuilder.toString());

        // final with var for auto type inference since Java 10
        final var FINAL_VAR = 10;
        final var MSG = "hello";

        // if the variable hasn't been initialized it can be assigned later on
        final int age;
        age = 29;

        // but once it has been initialized it cannot be assignned again
        // age = 39;
        final int time = 4;
        // time = 5;
    }
}