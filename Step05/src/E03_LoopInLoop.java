
public class E03_LoopInLoop {

	public static void main(String[] args) {
		
//		for(int dan = 2; dan < 10; dan++) {
//			System.out.println("====" + dan + " 단====");
//			for(int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %d\n", dan, i, i * dan);
//			}
//		}
		
		int dan = 2;
		while (dan < 10 ) {
			int i = 1;			//i를 1로 초기화
			System.out.println("=== " + dan + "단 ===");
			while (i < 10) {
				System.out.printf("%d * %d = %d\n", dan, i, i * dan);
				i++;
			}
			dan++;
			System.out.println();
		}
		
	}

}
