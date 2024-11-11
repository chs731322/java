import java.util.Scanner;

public class E01_LoopInput {

	public static void main(String[] args) {
		/*
		 * 반복문으로 원하는 만큼 데이터 입력을 받은 후에
		 * 수행한 작업 결과를 출력하는 코드를 작성
		 */
		
		/*
		 * 숫자를 5번 입력 받아서
		 * 입력 받은 숫자들의 총합 출력
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("숫자 %d 입력 >> ", i+1);
			int n = sc.nextInt();
			sum += n;
		}
		System.out.println("숫자 총합 >> " + sum);
		
	}

}
