
public class E05_Quest {

	public static void main(String[] args) {

		/*
		 * 1~100까지의 숫자들 중에 4와 7의 배수를 출력
		 * 단 4와 7의 공배수는 1번만 출력
		 * 
		 */
		int i = 1;
		
		while(i <= 100) {
			if(i % 4 == 0 || i % 7 == 0)
				System.out.print(i + " ");
			i++;
		}
	}

}