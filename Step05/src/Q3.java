
public class Q3 {

	public static void main(String[] args) {
		// 단보다 곱하는 수가 작거나 같은 경우만 출력

		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i <= dan; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, i * dan);
			}
			System.out.println();
		}

		//break문 사용
//		for (int dan = 2; dan < 10; dan++) {
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %d\n", dan, i, i * dan);
//				if (dan <= i)
//					break;
//			}
//			System.out.println();
//		}
//		
	}

}
