
public class E04_Quest {

	public static void main(String[] args) {
		/*
		 * 1~10까지의 숫자의 약수 목록을 아래와 같은 형태로 출력
		 * 
		 * 1
		 * 1 2
		 * 1 3
		 * 1 2 4
		 * 1 5
		 * 1 2 3 6
		 * 
		 */
		
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i % j == 0)
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
