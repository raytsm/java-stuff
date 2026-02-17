public class WhileBreak {
	public static void main(String[] args) {
		int i = 10;
		while (true) {
			System.out.println("LOOP " + i);
			if (i == 0){
				 break;
			}
			i--;
		}
	}
}
