
public class E06_Quest {

	public static void main(String[] args) {

		/*
		 * 1~100까지 숫자들의 합을 출력
		 * 
		 * 1. 변수 선언
		 * 2. 1~100까지 반복
		 * 3. 반복할 일 작성 : 변수에 더해서 누적 저장
		 * 4. 결과 출력
		 * 
		 */
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}