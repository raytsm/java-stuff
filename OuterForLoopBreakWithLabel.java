public class OuterForLoopBreakWithLabel {
	public static void main(String[] args) {
		outerLoop:
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++) {
				System.out.println(j + " ");
				if (i == j) {
					break outerLoop;
				}
			}
		System.out.println(); 
		}
	}
}
