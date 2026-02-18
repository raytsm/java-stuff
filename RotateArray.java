import java.util.Arrays;
import java.util.Scanner;

public  class RotateArray {
    private static void rotate(int[] arr, int steps) {
        int[] newArr = new int[arr.length];
        int newSteps = steps;
        while (newSteps > arr.length) {
            newSteps = newSteps - arr.length;
        }

        for (int i = 0; i < (arr.length - newSteps); i++) {
            newArr[i + newSteps] = arr[i];
        }
        for (int i = 0; i < newSteps; i++) {
            newArr[i] = arr[arr.length - newSteps + i];
        }

        for (int ar : newArr) {
            System.out.print(ar + " ");
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
    }
}