import java.util.Scanner;

public class CheckPairExist {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];
        int[] checkNum = new int[2];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            checkNum[i] = sc.nextInt();
        }

        checker(num, arr, checkNum);
    }
    static void checker(int num, int[] arr, int[] checkNum) {
        boolean flag = false;
        for (int i = 0; i < num-1; i++) {
            if (arr[i] == checkNum[0] && arr[i+1] == checkNum[1]) {
                flag = true;
                break;
            } else if (arr[i] == checkNum[1] && arr[i+1] == checkNum[0]) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}