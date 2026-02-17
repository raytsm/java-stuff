import java.sql.SQLOutput;
import java.util.Scanner;

public class GenerateSequence {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0; // count the number of prints
        int number = 1; // number to be printed
        while ( count < n) {
            for (int i = 0; i < number && count < n; i++) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}