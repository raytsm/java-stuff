import java.util.Arrays;

public class ArrayDemo  {
	public static void main(String[] args) {
        int[] arr;
        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.toString(arr3));

        // array can be modified but never changed
        arr3[2] = 4;
        System.out.println(Arrays.toString(arr3));

        // by default an instantiated array have default value of their type
        int[] arr4 = new int[5];
        System.out.println(Arrays.toString(arr4)); // 0, 0, 0, 0, 0

        // fill array
        char[] arr5 = new char[5];
        Arrays.fill(arr5, 0, arr5.length/2, 'A');
        Arrays.fill(arr5, arr5.length/2, arr5.length, 'B');
        System.out.println(Arrays.toString(arr5));
        System.out.println(arr5);



    }
}