
public class Q2 {

	public static void main(String[] args) {
		//구구단 짝수 단만 출력
		
//		for(int i = 1; i < 10; i++) {
//			for(int dan = 2; dan < 10; dan++) {
//				if(dan % 2 == 0)
//					System.out.printf("%d * %d = %d\t", dan, i, i * dan);
//			}
//			System.out.println();
//		}
//		
		
		//continue문 사용
		for(int i = 1; i < 10; i++) {
			for(int dan = 2; dan < 10; dan++) {
				if(dan % 2 == 1)
					continue;
				System.out.printf("%d * %d = %d\t", dan, i, i * dan);
			}
			System.out.println();
		}

	}

}
