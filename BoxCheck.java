import java.util.Scanner;

public class BoxCheck {
    static void main() {
            // write your code here
            Scanner sc = new Scanner(System.in);

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int z1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int z2 = sc.nextInt();

            int[] box1 = {x1, y1, z1};
            int[] box2 = {x2, y2, z2};

            outerLoop:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (box1[i] == box2[j]) {
                        System.out.println("Incompatible");
                        break outerLoop;
                    }
                }
            }
    }
}