import java.util.Scanner;

public class ReadUnknownLength {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(sc.hasNextInt()) {
			int elem = sc.nextInt();
			sum += elem;
		}
		sc.close();
		System.out.println(sum);
	}
}
